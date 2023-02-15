LAMBDA_ENDPOINT=$(aws cloudformation describe-stacks --stack-name quarkus-serverless \
  --query 'Stacks[0].Outputs[?OutputKey==`QuarkusServerlessApi`].OutputValue' \
  --output text)

bzt ../taurus.yaml -o scenarios.hello.requests="[${LAMBDA_ENDPOINT}]" -report
