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

بخش دوم:

کدی که زدیم کد ساده ای برای محاسبه توان یک عدد به عدد دیگری به پیمانه عدد سوم ثابتی است.
کد اولیه که مصرف CPU زیادی دارد به روش بدیهی با n بار ضرب کردن عدد در خودش توان را به دست می‌آورد. عکس پروفایلینگ آن در زیر آمده است : 
![Screenshot (622)](https://github.com/user-attachments/assets/1f392772-d033-434b-9c88-c3429200a1eb)


برای بهبود کد از الگوریتمی از اردر لگاریتم n استفاده می کنیم و با به توان دو رساندن پایه به توان نصف توان سریعتر و با مصرف CPU کمتری به جواب می‌رسیم. عکس پروفایلینگ آن در زیر آمده است : 
![Screenshot 2024-12-02 225342](https://github.com/user-attachments/assets/7da80f04-154d-46a1-bbfb-8ef32af1e375)

