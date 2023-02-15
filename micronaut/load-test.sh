LAMBDA_ENDPOINT=$(aws cloudformation describe-stacks --stack-name micronaut-serverless \
  --query 'Stacks[0].Outputs[?OutputKey==`MicronautServerlessApi`].OutputValue' \
  --output text)

bzt ../taurus.yaml -o scenarios.hello.requests="[${LAMBDA_ENDPOINT}]" -report
