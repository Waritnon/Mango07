public interface Handler {
    public void setHandler(Handler nextHandler);
    // method สำหรับกำหนด nextHandler
    // เอาไว้ใช้เวลาที่ตัวเอง process ไม่ได้
    // จะส่งต่อให้ nextHandler process
    public void process(File file);
    public String getName();
}
