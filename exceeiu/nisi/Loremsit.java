int currentMonth = getMonthInt(new Date());
int currentYear = getYearInt(new Date());

List<Product> productList = productRepository.findAll();

for (Product product : productList) {
    int fetchedMonth = getMonthInt(product.getShipmentDate());
    int fetchedYear = getYearInt(product.getShipmentDate());

    if (fetchedMonth == currentMonth && fetchedYear == currentYear) {
        // Record exists
    } else {
        // Do something else
    }
}
