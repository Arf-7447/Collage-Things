# College-Things

Repository For Push And Track My College Activity

# Testing ADD SOME Syntax

Hello !


Untuk menjawab pertanyaan-pertanyaan terkait sistem kendali lingkar tertutup ini, kita akan menggunakan beberapa teknik analisis dalam teori kontrol, termasuk diagram locus akar (root locus), analisis sumbu imajiner, dan perhitungan titik breakaway serta sudut keberangkatan dari kutub kompleks. Berikut adalah langkah-langkah untuk menjawab setiap bagian:

### Bagian a: Gambar sket "the root locus" dengan program Python

Kita akan menggunakan pustaka `matplotlib` dan `control` di Python untuk menggambar root locus dari fungsi transfer yang diberikan. Fungsi transfer tertutup \( G(s) \) adalah:

\[ G(s) = \frac{K(s+3)}{s^2 - 2s + 10} \]

```python
import numpy as np
import matplotlib.pyplot as plt
import control as ctrl

# Define the transfer function
num = [1, 3]  # Coefficients of the numerator polynomial (s + 3)
den = [1, -2, 10]  # Coefficients of the denominator polynomial (s^2 - 2s + 10)
G = ctrl.TransferFunction(num, den)

# Plot the root locus
ctrl.rlocus(G)
plt.title('Root Locus of G(s) = K(s+3)/(s²-2s+10)')
plt.xlabel('Real Axis')
plt.ylabel('Imaginary Axis')
plt.grid(True)
plt.show()
```

### Bagian b: Tentukan "the imaginary axis crossing"

Untuk menentukan titik potong sumbu imajiner, kita mencari nilai \( K \) saat bagian real dari akar karakteristik sistem menjadi nol. Persamaan karakteristik tertutup adalah:

\[ 1 + K\frac{s+3}{s^2 - 2s + 10} = 0 \]

\[ s^2 - 2s + 10 + K(s + 3) = 0 \]

Setelah menyusun ulang, kita memiliki:

\[ s^2 - (2 - K)s + (10 + 3K) = 0 \]

Untuk akar pada sumbu imajiner, kita membutuhkan bagian real menjadi nol, sehingga:

\[ - (2 - K) = 0 \]

\[ K = 2 \]

Masukkan \( K = 2 \) ke dalam persamaan karakteristik:

\[ s^2 - 0s + (10 + 6) = 0 \]

\[ s^2 + 16 = 0 \]

\[ s = \pm j4 \]

### Bagian c: Hitung "the gain K" pada "the imaginary axis crossing"

Dari bagian b, kita menemukan bahwa nilai \( K \) pada titik potong sumbu imajiner adalah:

\[ K = 2 \]

### Bagian d: Tentukan "the breakaway point"

Titik breakaway adalah titik di mana dua akar real dari diagram locus akar bergabung menjadi satu atau bercabang menjadi dua akar kompleks. Untuk menemukannya, kita mencari titik-titik di mana turunan \( K \) terhadap \( s \) adalah nol.

Dari persamaan karakteristik:

\[ s^2 - (2 - K)s + (10 + 3K) = 0 \]

Kita hitung \( K \):

\[ K = \frac{s^2 + 10}{s - 3} \]

Untuk breakaway point:

\[ \frac{dK}{ds} = 0 \]

Menghitung turunan \( K \) terhadap \( s \):

\[ \frac{d}{ds} \left( \frac{s^2 + 10}{s - 3} \right) = 0 \]

Menggunakan aturan hasil bagi:

\[ \frac{(s - 3) \cdot (2s) - (s^2 + 10) \cdot 1}{(s - 3)^2} = 0 \]

\[ (s - 3)(2s) - (s^2 + 10) = 0 \]

\[ 2s^2 - 6s - s^2 - 10 = 0 \]

\[ s^2 - 6s - 10 = 0 \]

\[ s = \frac{6 \pm \sqrt{36 + 40}}{2} \]

\[ s = \frac{6 \pm \sqrt{76}}{2} \]

\[ s = 3 \pm \sqrt{19} \]

### Bagian e: Hitung "the angles of departure" dari "the complex poles"

Sudut keberangkatan dari kutub kompleks dapat dihitung menggunakan formula sudut:

\[ \theta = 180^\circ - \sum(\text{angle of zeros}) + \sum(\text{angle of poles}) \]

Kutub sistem kita adalah solusi dari \( s^2 - 2s + 10 = 0 \):

\[ s = 1 \pm j3 \]

Hanya ada satu nol di \( s = -3 \). Mari hitung sudut keberangkatan dari kutub \( 1 + j3 \):

- Sudut dari nol \( s = -3 \) ke \( 1 + j3 \):

\[ \theta_{zero} = \text{atan2}(3 - 0, 1 - (-3)) \]
\[ \theta_{zero} = \text{atan2}(3, 4) \approx 36.87^\circ \]

- Sudut dari kutub \( 1 - j3 \):

\[ \theta_{pole} = \text{atan2}(3 - (-3), 1 - 1) \]
\[ \theta_{pole} = \text{atan2}(6, 0) = 90^\circ \]

Sudut keberangkatan dari kutub \( 1 + j3 \):

\[ \theta = 180^\circ - 36.87^\circ - 90^\circ = 53.13^\circ \]

Jadi, sudut keberangkatan dari kutub \( 1 + j3 \) adalah sekitar \( 53.13^\circ \).

Langkah-langkah ini memberikan gambaran lengkap mengenai analisis sistem kendali lingkar tertutup yang diberikan.
