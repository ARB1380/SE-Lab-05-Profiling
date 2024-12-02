# گزارش آزمایش پنچم آزمایشگاه مهندسی نرم افزار
نام دانشجویان :

علیرضا فرشی  99101976

محمد ایزدی   99101268

ابوالفضل قلندری  99102026

در قسمت اول آزمایش پروفایلینگ کلاس javacup را انجام دادیم و متوجه شدیم که تابع temp در این کلاس حافظه زیاد و cpu time زیادی نسبت به سایر قسمت ها مصرف می کند. دو اسکرین شات زیر وضعیت cpu time و memory را نشان می دهد که با کلیک روی نقطه peak نمودار تابع آن را نشان می دهد.

![Screenshot (615)](https://github.com/user-attachments/assets/9d12dab7-71cc-44cc-9ea1-35c12dca3784)

![Screenshot (616)](https://github.com/user-attachments/assets/87f32e08-f3dc-4b5d-b270-84f4273f95a6)

حال با تغییر ArrayList به array از جنس int مشکل ما برطرف شد. دلیل آن این است که با اضفه کردن i + j به ArrayList لازم بود یک آبجکت از نوع Integer ساخته شود که سربار زیادی روی پردازنده و حافظه ایجاد می کرد ولی در array عادی دیگر این مشکل وجود ندارد. در شکل زیر وضعیت cpu time و memory را مشاهده می کنید که بهتر شده است.

![Screenshot (619)](https://github.com/user-attachments/assets/c752e555-d4d6-4c6c-9fef-e5c6ad50822f)
![Screenshot (620)](https://github.com/user-attachments/assets/157ce165-f2f6-4b38-87de-388d982f7fa7)

