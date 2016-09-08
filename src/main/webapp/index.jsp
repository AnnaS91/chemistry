<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored ="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Chemistry</title>
</head>
<body>
    <h2>Welcome to <strong>Chemistry</strong> catalog!
    </h2>

    <table border="0">
        <thead>
            <tr>
                <th>You can add your compound in our base</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Please fill in fields below:</td>
            </tr>
            <tr>
                <td>
                      <form>
                          Compound name: <input type="text"  name="name" size="10"><br>
                          Compound type: <input type="text"  name="type" size="10"><br>
                          <p>
                          <table>
                              <tr>
                              <th><small>
                                  <input type="submit" name="compoundSave" value="Save">
                              </small>
                             <tr/>
                          </table>
                      </form>
                </td>
            </tr>
        </tbody>
    </table>
</body>
</html>