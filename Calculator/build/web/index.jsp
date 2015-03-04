<%-- 
    Document   : index
    Created on : Jan 14, 2015, 4:49:50 PM
    Author     : Alizzabeth
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <font color="darkblue" align="center"><h1>Calculator</h1></font>
        <br/><br/>
        <div align="center">
            <form action="Calculate" method="post">
                <table>
                    <tr>
                        <th>number<br/><br/></th>
                        <th>operation<br/>(* , / , + , -)</th>
                        <th>number<br/><br/></th>
                    </tr>
                    <tr>
                        <td><input type="number" name="x" required></td>
                        <td><input type="text" name="z" required></td>
                        <td><input type="number" name="y" required></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="right"><input type="submit" value="Calculate"></td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center"><font color="red"><h2>${message}</h2></font></td>
                    </tr>
                    <tr>
                        <th><font color="red"><h3>Result</h3></font></th>
                        <td colspan="2"><h3>${result}</h3></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
