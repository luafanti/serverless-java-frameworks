# Vanilla Java on AWS Lambda

### Build & install

```bash
mvn clean package 

# To deploy Lambda without SnapStart
sam deploy -t template.yaml

# To deploy Lambda with SnapStart
sam deploy -t template.snapstart.yaml
```

### Delete stack

```bash
sam delete
```

### Statistic

**Without SnapStart**

<table class="table-bordered">
        <tr>
            <th colspan="2" style="horizontal-align : middle;text-align:center;"></th>
            <th colspan="4" style="horizontal-align : middle;text-align:center;">Cold Start (ms)</th>
            <th colspan="4" style="horizontal-align : middle;text-align:center;">Warm Start (ms)</th>           
        </tr>
        <tr>
            <th scope="col"> memory (MB)</th>
            <th scope="col">error rate</th>
            <th scope="col">p50</th>
            <th scope="col">p90</th>
            <th scope="col">p99</th>
            <th scope="col">max</th>
            <th scope="col">p50</th>
            <th scope="col">p90</th>
            <th scope="col">p99</th>
            <th scope="col">max</th>
        </tr>        
        <tr>
            <th>128</th>
            <td>0%</td>
            <td>754.9</td>
            <td>790.8</td>
            <td>826.9</td>
            <td>904</td>
            <td>11.3</td>
            <td>37</td>
            <td>228.2</td>
            <td>275.4</td>
        </tr>
        <tr>
            <th>256</th>
            <td>0%</td>
            <td>566.6</td>
            <td>599.9</td>
            <td>666.9</td>
            <td>676.1</td>
            <td>1.9</td>
            <td>15.4</td>
            <td>107.1</td>
            <td>328.2</td>
        </tr>
        <tr>
            <th>512</th>
            <td>0%</td>
            <td>549.4</td>
            <td>474.3</td>
            <td>502.1</td>
            <td>529.5</td>
            <td>1.6</td>
            <td>8.4</td>
            <td>50.9</td>
            <td>97.3</td>
        </tr>
        <tr>
            <th>1024</th>
            <td>0%</td>
            <td>426.1</td>
            <td>445.5</td>
            <td>466.1</td>
            <td>489.7</td>
            <td>1.6</td>
            <td>3.3</td>
            <td>20.6</td>
            <td>25.5</td>
        </tr>
        <tr>
            <th>4096</th>
            <td>0%</td>
            <td>301.7</td>
            <td>327.7</td>
            <td>415.9</td>
            <td>450.4</td>
            <td>1.5</td>
            <td>2.5</td>
            <td>13.2</td>
            <td>21.1</td>
        </tr>
</table>

**With SnapStart**

<table class="table-bordered">
        <tr>
            <th colspan="2" style="horizontal-align : middle;text-align:center;"></th>
            <th colspan="4" style="horizontal-align : middle;text-align:center;">Cold Start (ms)</th>
            <th colspan="4" style="horizontal-align : middle;text-align:center;">Warm Start (ms)</th>           
        </tr>
        <tr>
            <th scope="col"> memory (MB)</th>
            <th scope="col">error rate</th>
            <th scope="col">p50</th>
            <th scope="col">p90</th>
            <th scope="col">p99</th>
            <th scope="col">max</th>
            <th scope="col">p50</th>
            <th scope="col">p90</th>
            <th scope="col">p99</th>
            <th scope="col">max</th>
        </tr>        
        <tr>
            <th>128</th>
            <td>0%</td>
            <td>705.3</td>
            <td>773.3</td>
            <td>817.8</td>
            <td>896.2</td>
            <td>17.4</td>
            <td>52.6</td>
            <td>268</td>
            <td>479.7</td>
        </tr>
        <tr>
            <th>256</th>
            <td>0%</td>
            <td>401.6</td>
            <td>447.9</td>
            <td>473.2</td>
            <td>536.6</td>
            <td>7.7</td>
            <td>20.3</td>
            <td>120.2</td>
            <td>214.3</td>
        </tr>
        <tr>
            <th>512</th>
            <td>0%</td>
            <td>231.9</td>
            <td>261.9</td>
            <td>311.7</td>
            <td>1174.6</td>
            <td>1.7</td>
            <td>9.7</td>
            <td>53.5</td>
            <td>135.6</td>
        </tr>
        <tr>
            <th>1024</th>
            <td>0%</td>
            <td>203.9</td>
            <td>231.6</td>
            <td>367.3</td>
            <td>399.1</td>
            <td>1.6</td>
            <td>3.7</td>
            <td>24.8</td>
            <td>53.4</td>
        </tr>
        <tr>
            <th>4096</th>
            <td>0%</td>
            <td>241.5</td>
            <td>353.4</td>
            <td>484.1</td>
            <td>501.4</td>
            <td>1.5</td>
            <td>2.6</td>
            <td>14</td>
            <td>25.7</td>
        </tr>
</table>


