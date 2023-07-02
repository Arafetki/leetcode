/* 

Difficulty : Easy 

*/


# Method 1 : (Left Join)

SELECT C.name AS Customers
FROM Customers AS C
LEFT OUTER JOIN Orders AS O
ON C.id = O.customerId
WHERE O.customerId IS NULL ;

# Method 2 : (Subquery)

SELECT name AS Customers
FROM Customers 
WHERE id NOT IN (SELECT customerId FROM Orders)