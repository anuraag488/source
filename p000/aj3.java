package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class aj3 implements we1 {

    /* JADX INFO: renamed from: c */
    public static final Charset f14539c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public File f14540a;

    /* JADX INFO: renamed from: b */
    public yi3 f14541b;

    /* JADX INFO: renamed from: a */
    public final void m2999a() {
        File file = this.f14540a;
        if (this.f14541b == null) {
            try {
                this.f14541b = new yi3(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // p000.we1
    /* JADX INFO: renamed from: c */
    public final void mo3000c() {
        se0.m10731l(this.f14541b, "There was a problem closing the Crashlytics log file.");
        this.f14541b = null;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p000.we1
    /* JADX INFO: renamed from: f */
    public final String mo3001f() {
        zi3 zi3Var;
        byte[] bArr;
        if (this.f14540a.exists()) {
            m2999a();
            yi3 yi3Var = this.f14541b;
            if (yi3Var == null) {
                zi3Var = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[yi3Var.m13138u()];
                try {
                    yi3 yi3Var2 = this.f14541b;
                    yg3 yg3Var = new yg3((byte) 1);
                    yg3Var.f35215b = bArr2;
                    yg3Var.f35216c = iArr;
                    VarHandle.storeStoreFence();
                    yi3Var2.m13132e(yg3Var);
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                int i = iArr[0];
                zi3Var = new zi3();
                zi3Var.f36141b = bArr2;
                zi3Var.f36140a = i;
                VarHandle.storeStoreFence();
            }
        } else {
            zi3Var = null;
        }
        if (zi3Var == null) {
            bArr = null;
        } else {
            int i2 = zi3Var.f36140a;
            bArr = new byte[i2];
            System.arraycopy(zi3Var.f36141b, 0, bArr, 0, i2);
        }
        if (bArr != null) {
            return new String(bArr, f14539c);
        }
        return null;
    }

    @Override // p000.we1
    /* JADX INFO: renamed from: m */
    public final void mo3002m(String str, long j) {
        m2999a();
        if (this.f14541b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.f14541b.m13130a(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f14539c));
            while (!this.f14541b.m13133g() && this.f14541b.m13138u() > 65536) {
                this.f14541b.m13135l();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
