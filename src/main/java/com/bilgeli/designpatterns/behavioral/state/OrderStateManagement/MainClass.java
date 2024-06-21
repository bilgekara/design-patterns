package com.bilgeli.designpatterns.behavioral.state.OrderStateManagement;

public class MainClass {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.next();  // Sipariş oluşturuldu -> Ödeme işlemi başlatılıyor
        order.next();  // Ödeme başarılı -> Stok kontrolü başlatılıyor
        order.next();  // Stok kontrolü tamamlandı -> Teslimat ayarlanıyor
        order.next();  // Teslimat ayarlandı -> Sipariş tamamlandı

        // İptal işlemi (tamamlanmış sipariş iptal edilemez)
        order.cancel();  // Tamamlanan sipariş iptal edilemez
    }
}
