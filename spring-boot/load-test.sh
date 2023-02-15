LAMBDA_ENDPOINT=$(aws cloudformation describe-stacks --stack-name spring-boot-serverless \
  --query 'Stacks[0].Outputs[?OutputKey==`SpringBootServerlessApi`].OutputValue' \
  --output text)

bzt ../taurus.yaml -o scenarios.hello.requests="[${LAMBDA_ENDPOINT}]" -report
