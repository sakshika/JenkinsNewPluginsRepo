<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
  "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head><title>Account Info</title>
<link rel="stylesheet"
      href="./css/styles.css"
      type="text/css"/>
</head>
<body>
<div align="center">
<table border="5">
  <tr><th class="title">Account Info</th></tr>
</table>
<p/>
<ul>
  <li>Customer ID: ${customer.customerID}</li>
  <li>First name:  ${customer.firstName}</li>
  <li>Last name:   ${customer.lastName}</li>
  <li>Balance:     ${customer.formattedBalance}</li>
</ul>
</div></body></html>