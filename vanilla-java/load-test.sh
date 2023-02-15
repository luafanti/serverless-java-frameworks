LAMBDA_ENDPOINT=$(aws cloudformation describe-stacks --stack-name java-serverless \
  --query 'Stacks[0].Outputs[?OutputKey==`JavaBootServerlessApi`].OutputValue' \
  --output text)

bzt ../taurus.yaml -o scenarios.hello.requests="[${LAMBDA_ENDPOINT}]" -report
