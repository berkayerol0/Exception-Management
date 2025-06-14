
---

# Exception Management Application

---

## English

### About

This project is a Java-based Spring Boot application focused on global exception handling. It provides a structured and centralized way of managing errors and returning meaningful error messages through a custom response structure. The application also includes a simple employee query endpoint that demonstrates how exceptions are caught and returned in a standardized JSON format.

### Features

- **Centralized Error Handling:** Using @ControllerAdvice to catch all runtime exceptions.
- **Custom Exceptions:** Designed exception structure with enums and messages.
- **Structured API Responses:** Standard response format using RootEntity.
- **Error Details:** Includes host info, request path, time, and message.
- **Employee Service:** Returns employee data with embedded department info.

### Technologies

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **Build Tool:** Maven

### API Usage

**Call the endpoint:**
GET /rest/api/employee/list/{id}
If no employee is found, a structured error response is returned.
API responses follow a unified format for both success and error.

### License

This project is licensed under the MIT License.

---

### Türkçe

### Hakkında

Bu proje, Java diliyle Spring Boot kullanılarak geliştirilmiş bir merkezi hata yönetimi (exception handling) uygulamasıdır. Uygulamada özel hata yapıları tanımlanmış, tüm hatalar @ControllerAdvice ile yakalanarak, anlamlı ve formatlı bir JSON çıktısı dönülmektedir. Basit bir çalışan sorgulama servisi ile örneklendirilmiştir.

### Özellikler

- **Merkezi Hata Yönetimi:** Tüm hatalar @ControllerAdvice ile yakalanır.
- **Özelleştirilmiş Exception Yapısı:** Enum tabanlı hata mesajları ve hata sınıfları.
- **Standart API Yanıt Formatı:** RootEntity ile tüm yanıtlar tek formatta döner.
- **Hata Detayları:** Host bilgisi, istek yolu, zaman ve mesaj gibi bilgiler içerir.
- **Çalışan Servisi:** Departman bilgisi ile birlikte çalışan verisi döner.

### Teknolojiler

Dil: Java
Framework: Spring Boot
Veritabanı: PostgreSQL
Proje Yönetimi: Maven

### API Kullanımı

**Endpoint örneği:**
GET /rest/api/employee/list/{id}
Eğer ID’ye ait çalışan bulunamazsa, hata detayları ile birlikte anlamlı bir JSON döner.
API çıktıları, başarı ve hata durumlarında aynı standart yapıya sahiptir.

### Lisans
Bu proje MIT Lisansı kapsamında lisanslanmıştır.

