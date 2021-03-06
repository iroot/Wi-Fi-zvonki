package org.spongycastle.util.encoders;

import android.support.v4.app.NotificationCompat;
import java.io.IOException;
import java.io.OutputStream;

public class HexEncoder implements Encoder {
    protected final byte[] a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    protected final byte[] b = new byte[NotificationCompat.FLAG_HIGH_PRIORITY];

    protected void a() {
        int i = 0;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            this.b[i2] = (byte) -1;
        }
        while (i < this.a.length) {
            this.b[this.a[i]] = (byte) i;
            i++;
        }
        this.b[65] = this.b[97];
        this.b[66] = this.b[98];
        this.b[67] = this.b[99];
        this.b[68] = this.b[100];
        this.b[69] = this.b[101];
        this.b[70] = this.b[102];
    }

    public HexEncoder() {
        a();
    }

    public int a(byte[] bArr, int i, int i2, OutputStream outputStream) {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.a[i4 >>> 4]);
            outputStream.write(this.a[i4 & 15]);
        }
        return i2 * 2;
    }

    private static boolean a(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public int a(String str, OutputStream outputStream) {
        int i = 0;
        int length = str.length();
        while (length > 0 && a(str.charAt(length - 1))) {
            length--;
        }
        int i2 = 0;
        while (i < length) {
            int i3 = i;
            while (i3 < length && a(str.charAt(i3))) {
                i3++;
            }
            i = i3 + 1;
            byte b = this.b[str.charAt(i3)];
            while (i < length && a(str.charAt(i))) {
                i++;
            }
            i3 = i + 1;
            byte b2 = this.b[str.charAt(i)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            outputStream.write(b2 | (b << 4));
            i2++;
            i = i3;
        }
        return i2;
    }
}
