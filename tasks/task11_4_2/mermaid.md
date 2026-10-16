classDiagram
class Customer {
name: String
address: String
placeOrder()
}
class Order {
orderNumber: Int
datePlaced: String
deliveryDate: String
checkStock()
takePayment()
}
class OrderItem {
name: String
description: String
}
Customer --> Order : places
Order --> OrderItem : includes