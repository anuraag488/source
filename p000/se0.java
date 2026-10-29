package p000;

import ads_mobile_sdk.C0321s2;
import ads_mobile_sdk.su1;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendModeColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import essentials.app.EsApp;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class se0 {

    /* JADX INFO: renamed from: g */
    public static final pg0 f30194g;

    /* JADX INFO: renamed from: i */
    public static final pg0 f30196i;

    /* JADX INFO: renamed from: j */
    public static final pg0 f30197j;

    /* JADX INFO: renamed from: k */
    public static final pg0 f30198k;

    /* JADX INFO: renamed from: l */
    public static final pg0 f30199l;

    /* JADX INFO: renamed from: n */
    public static jp3 f30201n;

    /* JADX INFO: renamed from: t */
    public static final z45 f30207t;

    /* JADX INFO: renamed from: a */
    public static final char[] f30188a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final C0743hz f30189b = new C0743hz(-1.0f);

    /* JADX INFO: renamed from: c */
    public static final C0743hz f30190c = new C0743hz(1.0f);

    /* JADX INFO: renamed from: d */
    public static final pg0 f30191d = new pg0(206760117, false, new qg0(20));

    /* JADX INFO: renamed from: e */
    public static final pg0 f30192e = new pg0(292009777, false, new qg0(21));

    /* JADX INFO: renamed from: f */
    public static final pg0 f30193f = new pg0(-1642608458, false, new fh0(14));

    /* JADX INFO: renamed from: h */
    public static final pg0 f30195h = new pg0(-834613602, false, new xg0(23));

    /* JADX INFO: renamed from: m */
    public static final pg0 f30200m = new pg0(547764629, false, new ah0(26));

    /* JADX INFO: renamed from: o */
    public static final Object f30202o = new Object();

    /* JADX INFO: renamed from: p */
    public static final Object f30203p = new Object();

    /* JADX INFO: renamed from: q */
    public static final Object f30204q = new Object();

    /* JADX INFO: renamed from: r */
    public static final Object f30205r = new Object();

    /* JADX INFO: renamed from: s */
    public static final Object f30206s = new Object();

    static {
        byte b = 22;
        f30194g = new pg0(-1101924039, false, new xg0(b));
        byte b2 = 24;
        f30196i = new pg0(-1311239856, false, new ah0(b2));
        f30197j = new pg0(-2029682603, false, new xg0(b2));
        byte b3 = 25;
        f30198k = new pg0(1029704725, false, new xg0(b3));
        f30199l = new pg0(1681588695, false, new ah0(b3));
        f30207t = new z45(b);
    }

    /* JADX INFO: renamed from: C */
    public static int m10690C(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* JADX INFO: renamed from: D */
    public static final float m10691D(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: E */
    public static final float m10692E(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: F */
    public static final nt2 m10693F(nt2 nt2Var, yp1 yp1Var) {
        p00 p00Var = new p00();
        p00Var.f27255a = yp1Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(p00Var);
    }

    /* JADX INFO: renamed from: G */
    public static nt2 m10694G(nt2 nt2Var, float f, float f2, p44 p44Var, boolean z, int i) {
        float f3 = (i & 2) != 0 ? 1.0f : -1.0f;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        if ((i & 32) != 0) {
            f2 = 0.0f;
        }
        float f4 = (i & 256) == 0 ? 90.0f : 0.0f;
        long j = to4.f31292b;
        if ((i & 2048) != 0) {
            p44Var = k43.f22879x;
        }
        if ((i & 4096) != 0) {
            z = false;
        }
        long j2 = eu1.f18488a;
        ye2 ye2Var = ye2.f35161a;
        cu1 cu1Var = new cu1();
        cu1Var.f16482a = 1.0f;
        cu1Var.f16483b = f3;
        cu1Var.f16484c = f;
        cu1Var.f16485d = f2;
        cu1Var.f16486e = f4;
        cu1Var.f16487f = 8.0f;
        cu1Var.f16488g = j;
        cu1Var.f16489h = p44Var;
        cu1Var.f16490i = z;
        cu1Var.f16491j = j2;
        cu1Var.f16492k = j2;
        cu1Var.f16493l = (byte) 3;
        cu1Var.f16494m = ye2Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(cu1Var);
    }

    /* JADX INFO: renamed from: H */
    public static String m10695H(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f30188a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: I */
    public static final x32 m10696I(x32... x32VarArr) {
        byte b = 0;
        x32 x32Var = new x32(b);
        x32Var.f33959f = x32VarArr;
        int length = x32VarArr.length;
        gx1[] gx1VarArr = new gx1[length];
        for (int i = 0; i < length; i++) {
            gx1VarArr[i] = x32VarArr[i].m12467b();
        }
        byte b2 = 1;
        ux4 ux4Var = new ux4(b2);
        ux4Var.f32238b = gx1VarArr;
        VarHandle.storeStoreFence();
        x32Var.f33955b = new gx1(ux4Var, (byte) 1);
        int length2 = x32VarArr.length;
        gx1[] gx1VarArr2 = new gx1[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            gx1VarArr2[i2] = x32VarArr[i2].m12469d();
        }
        fx1 fx1Var = new fx1(b2);
        fx1Var.f19374b = gx1VarArr2;
        VarHandle.storeStoreFence();
        x32Var.f33956c = new gx1(fx1Var, (byte) 0);
        int length3 = x32VarArr.length;
        gx1[] gx1VarArr3 = new gx1[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            gx1VarArr3[i3] = x32VarArr[i3].m12468c();
        }
        ux4 ux4Var2 = new ux4(b);
        ux4Var2.f32238b = gx1VarArr3;
        VarHandle.storeStoreFence();
        x32Var.f33957d = new gx1(ux4Var2, (byte) 1);
        int length4 = x32VarArr.length;
        gx1[] gx1VarArr4 = new gx1[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            gx1VarArr4[i4] = x32VarArr[i4].m12466a();
        }
        fx1 fx1Var2 = new fx1(b);
        fx1Var2.f19374b = gx1VarArr4;
        VarHandle.storeStoreFence();
        x32Var.f33958e = new gx1(fx1Var2, (byte) 0);
        VarHandle.storeStoreFence();
        return x32Var;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10697J() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    /* JADX INFO: renamed from: K */
    public static boolean m10698K() {
        boolean zM10697J = m10697J();
        String str = Build.TAGS;
        if ((zM10697J || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM10697J && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static int m10699L(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    /* JADX INFO: renamed from: M */
    public static final long m10700M(long j, long j2) {
        return ji1.m7130a(m10691D(j) - m10691D(j2), m10692E(j) - m10692E(j2));
    }

    /* JADX INFO: renamed from: N */
    public static int m10701N(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    /* JADX INFO: renamed from: O */
    public static te4 m10702O(Object obj) {
        te4 te4Var = new te4();
        te4Var.f31098a = obj;
        VarHandle.storeStoreFence();
        return te4Var;
    }

    /* JADX INFO: renamed from: R */
    public static nt2 m10703R(nt2 nt2Var, i73 i73Var, o00 o00Var, int i) {
        C0853kz c0853kz = ig1.f21382f;
        j73 j73Var = new j73();
        j73Var.f22071a = i73Var;
        j73Var.f22072b = true;
        j73Var.f22073c = c0853kz;
        j73Var.f22074d = im0.f21547b;
        j73Var.f22075e = 1.0f;
        j73Var.f22076f = o00Var;
        VarHandle.storeStoreFence();
        return nt2Var.mo7630d(j73Var);
    }

    /* JADX INFO: renamed from: S */
    public static final long m10704S(long j, long j2) {
        return ji1.m7130a(m10691D(j2) + m10691D(j), m10692E(j2) + m10692E(j));
    }

    /* JADX INFO: renamed from: T */
    public static final dz0 m10705T(mi0 mi0Var) {
        return (dz0) m10708W("screen_state", 0L, new en0((byte) 14), mi0Var, 6, 14).invoke(mi0Var, 0);
    }

    /* JADX INFO: renamed from: U */
    public static final ww4 m10706U(g12 g12Var, mi0 mi0Var) {
        o00 o00Var;
        ir1 ir1Var = (ir1) mi0Var;
        ky0 ky0Var = (ky0) ir1Var.m6898k(ij0.f21473h);
        float f = g12Var.f19496j;
        boolean zM6888f = ir1Var.m6888f((((long) Float.floatToRawIntBits(ky0Var.mo3580c())) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object objM6869O = ir1Var.m6869O();
        if (zM6888f || objM6869O == ki0.f23136a) {
            iu1 iu1Var = new iu1();
            m10733n(iu1Var, g12Var.f19492f);
            float f2 = g12Var.f19488b;
            float f3 = g12Var.f19489c;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(ky0Var.mo3575E(f2))) << 32) | (((long) Float.floatToRawIntBits(ky0Var.mo3575E(f3))) & 4294967295L);
            float fIntBitsToFloat = g12Var.f19490d;
            float fIntBitsToFloat2 = g12Var.f19491e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            ww4 ww4Var = new ww4();
            d83 d83VarM7398w = k43.m7398w(h74.m6269a(0L));
            ww4Var.f33802f = d83VarM7398w;
            d83 d83VarM7398w2 = k43.m7398w(Boolean.FALSE);
            ww4Var.f33803g = d83VarM7398w2;
            rw4 rw4Var = new rw4();
            rw4Var.f29689b = iu1Var;
            qw4 qw4Var = new qw4((byte) 0);
            qw4Var.f28855b = rw4Var;
            VarHandle.storeStoreFence();
            iu1Var.f21793i = qw4Var;
            rw4Var.f29690c = "";
            rw4Var.f29691d = true;
            p31 p31Var = new p31();
            df2 df2Var = df2.f17011a;
            p31Var.f27337b = 0L;
            p31Var.f27336a = 0;
            p31Var.f27340e = new j70();
            VarHandle.storeStoreFence();
            rw4Var.f29692e = p31Var;
            rw4Var.f29693f = new nu3((byte) 20);
            d83 d83VarM7398w3 = k43.m7398w(null);
            rw4Var.f29694g = d83VarM7398w3;
            d83 d83VarM7398w4 = k43.m7398w(h74.m6269a(0L));
            rw4Var.f29696i = d83VarM7398w4;
            rw4Var.f29697j = 9205357640488583168L;
            rw4Var.f29698k = 1.0f;
            rw4Var.f29699l = 1.0f;
            qw4 qw4Var2 = new qw4((byte) 1);
            qw4Var2.f28855b = rw4Var;
            VarHandle.storeStoreFence();
            rw4Var.f29700m = qw4Var2;
            VarHandle.storeStoreFence();
            sj4 sj4Var = new sj4((byte) 5);
            sj4Var.f30344b = ww4Var;
            VarHandle.storeStoreFence();
            rw4Var.f29693f = sj4Var;
            ww4Var.f33804h = rw4Var;
            ww4Var.f33805i = new d83(ju4.f22634a, o85.f26450j);
            ww4Var.f33806j = 1.0f;
            VarHandle.storeStoreFence();
            String str = g12Var.f19487a;
            long j = g12Var.f19493g;
            int i = g12Var.f19494h;
            if (j != 16) {
                BlendModeColorFilter blendModeColorFilter = new BlendModeColorFilter(zy5.m13858V(j), d24.m4295J(i));
                o00 o00Var2 = new o00();
                o00Var2.f26229a = blendModeColorFilter;
                o00Var2.f26230b = j;
                o00Var2.f26231c = i;
                VarHandle.storeStoreFence();
                o00Var = o00Var2;
            } else {
                o00Var = null;
            }
            boolean z = g12Var.f19495i;
            d83VarM7398w.setValue(h74.m6269a(jFloatToRawIntBits));
            d83VarM7398w2.setValue(Boolean.valueOf(z));
            d83VarM7398w3.setValue(o00Var);
            d83VarM7398w4.setValue(h74.m6269a(jFloatToRawIntBits2));
            rw4Var.f29690c = str;
            ir1Var.m6905n0(ww4Var);
            objM6869O = ww4Var;
        }
        return (ww4) objM6869O;
    }

    /* JADX INFO: renamed from: V */
    public static int m10707V(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM7372F = k43.m7372F(obj);
        int i2 = iM7372F & i;
        int iM10715c0 = m10715c0(i2, obj3);
        if (iM10715c0 != 0) {
            int i3 = ~i;
            int i4 = iM7372F & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM10715c0 - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && qs5.m10116u(obj, objArr[i6]) && (objArr2 == null || qs5.m10116u(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        m10717d0(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = m10699L(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iM10715c0 = i9;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: W */
    public static final mq1 m10708W(String str, long j, mq1 mq1Var, mi0 mi0Var, int i, int i2) {
        Object obj;
        mw3 mw3Var = (mw3) ((ir1) mi0Var).m6898k(qw3.m10145a());
        Context context = (Context) ((ir1) mi0Var).m6898k(AndroidCompositionLocals_androidKt.f14651b);
        nc4 nc4Var = hj0.f20619a;
        ui0 ui0Var = (ui0) ((EsApp) context.getApplicationContext()).f18452b.getValue();
        if ((i2 & 8) != 0) {
            r50 r50Var = i41.f21117b;
            j = 0;
        }
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6885d0(1983082805);
        Object obj2 = mw3Var.f25263a.get(str);
        Object obj3 = obj2;
        if (obj2 == null) {
            obj3 = qw3.f28853d;
        }
        Object obj4 = qw3.f28853d;
        Object obj5 = obj3;
        if (obj3 == obj4) {
            boolean zM6890g = ir1Var.m6890g(mw3Var) | ir1Var.m6894i(str);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == ki0.f23136a) {
                obj = objM6869O;
                jp1 jp1Var = new jp1((byte) 20);
                jp1Var.f22485b = mw3Var;
                jp1Var.f22486c = str;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(jp1Var);
                obj = jp1Var;
            }
            obj = objM6869O;
            um0 um0VarM13670b = zp0.m13670b(ui0Var.mo5182k());
            o54 o54Var = new o54();
            o54Var.f26358e = ui0Var;
            o54Var.f26359f = mq1Var;
            o54Var.f26360g = j;
            o54Var.f26361h = um0VarM13670b;
            o54Var.f26362i = (wp1) obj;
            o54Var.f26357d = k43.m7398w(obj4);
            VarHandle.storeStoreFence();
            u04 u04Var = new u04((byte) 1);
            u04Var.f31581b = o54Var;
            VarHandle.storeStoreFence();
            mw3Var.f25263a.put(str, u04Var);
            obj5 = u04Var;
        }
        mq1 mq1Var2 = (mq1) obj5;
        ir1Var.m6912r(false);
        return mq1Var2;
    }

    /* JADX INFO: renamed from: X */
    public static final void m10709X(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    /* JADX INFO: renamed from: Y */
    public static final Object m10710Y(an4 an4Var, mq1 mq1Var) {
        w01 w01VarMo6961A = d24.m4321v(an4Var.f26153e.getContext()).mo6961A(an4Var.f14643f, an4Var, an4Var.f30702d);
        z01 z01Var = new z01();
        z01Var.f35666e = w01VarMo6961A;
        VarHandle.storeStoreFence();
        y70.m13005F(an4Var, true, z01Var);
        return as4.m3235N(an4Var, false, an4Var, mq1Var);
    }

    /* JADX INFO: renamed from: Z */
    public static String m10711Z(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return m10695H(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static String m10712a0(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final x32 m10713b(String str) {
        x32 x32Var = new x32((byte) 1);
        x32Var.f33959f = str;
        x32Var.f33955b = new gx1(null, (byte) 1);
        x32Var.f33956c = new gx1(null, (byte) 0);
        x32Var.f33957d = new gx1(null, (byte) 1);
        x32Var.f33958e = new gx1(null, (byte) 0);
        VarHandle.storeStoreFence();
        return x32Var;
    }

    /* JADX INFO: renamed from: b0 */
    public static String m10714b0(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m10715c0(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: d */
    public static int m10716d(wa2 wa2Var, int i) {
        return (wa2Var.f33192a.hashCode() + i) * 31;
    }

    /* JADX INFO: renamed from: d0 */
    public static void m10717d0(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0321s2 m10718e(wa2 wa2Var) {
        try {
            su1 su1Var = su1.f11748a;
            int iMo3526e = wa2Var.m12186z("width").mo3526e();
            int iMo3526e2 = wa2Var.m12186z("height").mo3526e();
            ba2 ba2VarM12186z = wa2Var.m12186z("is_fluid_height");
            boolean zMo3523b = ba2VarM12186z != null ? ba2VarM12186z.mo3523b() : false;
            C0321s2 c0321s2 = new C0321s2();
            c0321s2.f10995a = iMo3526e;
            c0321s2.f10996b = iMo3526e2;
            c0321s2.f10997c = zMo3523b;
            VarHandle.storeStoreFence();
            return c0321s2;
        } catch (Exception e) {
            ArrayList arrayList = i20.m6589n(e).f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            return null;
        }
    }

    /* JADX INFO: renamed from: e0 */
    public static int m10719e0(int i) {
        int iMax = Math.max(i + 1, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (1.0d * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        return Math.max(4, iHighestOneBit);
    }

    /* JADX INFO: renamed from: f */
    public static void m10720f(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th != th2) {
            Integer num = a82.f163a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = jb3.f22152a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final long m10721f0(long j, float f) {
        return ji1.m7130a(m10691D(j) * f, m10692E(j) * f);
    }

    /* JADX INFO: renamed from: g */
    public static final f32 m10722g(i32 i32Var, float f, float f2, e32 e32Var, mi0 mi0Var) {
        e32 e32Var2;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        sq4 sq4Var = sw4.f30612a;
        ir1 ir1Var = (ir1) mi0Var;
        Object objM6869O = ir1Var.m6869O();
        i50 i50Var = ki0.f23136a;
        if (objM6869O == i50Var) {
            f32 f32Var = new f32();
            f32Var.f18713i = i32Var;
            f32Var.f18705a = fValueOf;
            f32Var.f18706b = fValueOf2;
            f32Var.f18707c = sq4Var;
            f32Var.f18708d = k43.m7398w(fValueOf);
            e32Var2 = e32Var;
            f32Var.f18709e = new hi4(e32Var2, sq4Var, f32Var.f18705a, f32Var.f18706b, null);
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(f32Var);
            objM6869O = f32Var;
        } else {
            e32Var2 = e32Var;
        }
        f32 f32Var2 = (f32) objM6869O;
        boolean zM6894i = ir1Var.m6894i(e32Var2);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj = objM6869O2;
        if (zM6894i || objM6869O2 == i50Var) {
            C0590dx c0590dx = new C0590dx((byte) 4);
            c0590dx.f17475e = fValueOf;
            c0590dx.f17472b = f32Var2;
            c0590dx.f17473c = fValueOf2;
            c0590dx.f17474d = e32Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(c0590dx);
            obj = c0590dx;
        }
        lb5.m7914W(ir1Var, (wp1) obj);
        boolean zM6894i2 = ir1Var.m6894i(i32Var);
        Object objM6869O3 = ir1Var.m6869O();
        Object obj2 = objM6869O3;
        if (zM6894i2 || objM6869O3 == i50Var) {
            na1 na1Var = new na1((byte) 8);
            na1Var.f25595b = i32Var;
            na1Var.f25596c = f32Var2;
            VarHandle.storeStoreFence();
            ir1Var.m6905n0(na1Var);
            obj2 = na1Var;
        }
        lb5.m7923d(f32Var2, (yp1) obj2, ir1Var);
        return f32Var2;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Object m10723g0(long j, mq1 mq1Var, ym0 ym0Var) {
        if (j <= 0) {
            throw new zm4("Timed out immediately", null);
        }
        an4 an4Var = new an4(ym0Var, ym0Var.getContext());
        an4Var.f14643f = j;
        Object objM10710Y = m10710Y(an4Var, mq1Var);
        ap0 ap0Var = ap0.f14763a;
        return objM10710Y;
    }

    /* JADX INFO: renamed from: h */
    public static p60 m10724h(ix0 ix0Var) {
        C1040pn c1040pn = new C1040pn((byte) 6);
        c1040pn.f27754b = ix0Var;
        VarHandle.storeStoreFence();
        return AbstractC0647fd.m5686z(c1040pn);
    }

    /* JADX INFO: renamed from: h0 */
    public static final Object m10725h0(long j, mq1 mq1Var, ym0 ym0Var) {
        return m10723g0(d24.m4297L(j), mq1Var, ym0Var);
    }

    /* JADX INFO: renamed from: i */
    public static final gn0 m10726i(String str, String str2, wp1 wp1Var, g12 g12Var, nt2 nt2Var, yp1 yp1Var, ir1 ir1Var, int i, int i2) {
        Object obj;
        xn2 xn2Var;
        C1354y3 c1354y3;
        sw2 sw2Var;
        i50 i50Var;
        C0459am c0459am;
        Object obj2;
        ir1 ir1Var2;
        int i3;
        Object obj3;
        nt2 nt2Var2 = (i2 & 16) != 0 ? kt2.f23428a : nt2Var;
        boolean z = (i2 & 32) != 0;
        Context context = (Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b);
        sw2 sw2VarM7369C = k43.m7369C((String) m10708W("current_app", 0L, new en0((byte) 10), ir1Var, 6, 14).invoke(ir1Var, 0), ir1Var);
        dz0 dz0VarM10705T = m10705T(ir1Var);
        C1354y3 c1354y4 = (C1354y3) ir1Var.m6898k(AbstractC0637f4.f18723a);
        sw2 sw2VarM7369C2 = k43.m7369C(yp1Var, ir1Var);
        C0459am c0459am2 = (C0459am) ir1Var.m6898k(AbstractC0496bm.m3626a());
        xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
        i50 i50Var2 = ki0.f23136a;
        if (xn2Var2 == null) {
            ir1Var.m6885d0(-1476823888);
            ir1Var.m6912r(false);
            xn2Var = null;
        } else {
            ir1Var.m6885d0(-1476823887);
            String strConcat = str.concat("Control");
            boolean zM6890g = ir1Var.m6890g(strConcat) | ir1Var.m6890g(xn2Var2);
            Object objM6869O = ir1Var.m6869O();
            if (zM6890g || objM6869O == i50Var2) {
                obj = objM6869O;
                xn2 xn2VarM12723c = xn2Var2.m12723c(strConcat);
                ir1Var.m6905n0(xn2VarM12723c);
                obj = xn2VarM12723c;
            }
            xn2Var = (xn2) obj;
            ir1Var.m6912r(false);
        }
        byte b = 2;
        AbstractC0637f4.m5466a(new C0004a3(0, 16), null, ir1Var, 0, 2);
        Object objM6869O2 = ir1Var.m6869O();
        Object obj4 = objM6869O2;
        if (objM6869O2 == i50Var2) {
            d83 d83VarM7398w = k43.m7398w(Boolean.FALSE);
            ir1Var.m6905n0(d83VarM7398w);
            obj4 = d83VarM7398w;
        }
        sw2 sw2Var2 = (sw2) obj4;
        if (z62.m13387o((String) sw2VarM7369C.getValue(), str2)) {
            ir1Var.m6885d0(-408649863);
            Object objM6869O3 = ir1Var.m6869O();
            if (objM6869O3 == i50Var2) {
                obj3 = objM6869O3;
                f40 f40VarM5333H = ev0.m5333H(-1, null, null, 6);
                ir1Var.m6905n0(f40VarM5333H);
                obj3 = f40VarM5333H;
            }
            obj3 = objM6869O3;
            b80 b80Var = (b80) obj3;
            boolean zM6894i = ((((i & 112) ^ 48) > 32 && ir1Var.m6890g(str2)) || (i & 48) == 32) | ir1Var.m6894i(b80Var);
            Object objM6869O4 = ir1Var.m6869O();
            Object obj5 = objM6869O4;
            if (zM6894i || objM6869O4 == i50Var2) {
                C0558d0 c0558d0 = new C0558d0((byte) 12);
                c0558d0.f16655b = str2;
                c0558d0.f16656c = b80Var;
                VarHandle.storeStoreFence();
                ir1Var.m6905n0(c0558d0);
                obj5 = c0558d0;
            }
            i50Var = i50Var2;
            c0459am = c0459am2;
            c1354y3 = c1354y4;
            sw2Var = sw2VarM7369C2;
            AbstractC0637f4.m5467b(2048, true, null, (yp1) obj5, ir1Var, 54, 4);
            ir1 ir1Var3 = ir1Var;
            boolean zM6894i2 = ir1Var3.m6894i(b80Var) | ir1Var3.m6890g(c0459am) | ir1Var3.m6890g(c1354y3) | ir1Var3.m6890g(sw2Var);
            Object objM6869O5 = ir1Var3.m6869O();
            if (zM6894i2 || objM6869O5 == i50Var) {
                objM6869O5 = new C0667fx(b80Var, c0459am, c1354y3, sw2Var, sw2Var2, (wm0) null);
                ir1Var3.m6905n0(objM6869O5);
            }
            lb5.m7926g(ir1Var3, (mq1) objM6869O5, str2);
            ir1Var3.m6912r(false);
            ir1Var2 = ir1Var3;
        } else {
            c1354y3 = c1354y4;
            sw2Var = sw2VarM7369C2;
            i50Var = i50Var2;
            ir1 ir1Var4 = ir1Var;
            c0459am = c0459am2;
            sw2Var2 = sw2Var2;
            ir1Var4.m6885d0(-408024128);
            Object objM6869O6 = ir1Var4.m6869O();
            if (objM6869O6 == i50Var) {
                obj2 = objM6869O6;
                C0725hh c0725hh = new C0725hh(b);
                c0725hh.f20571b = sw2Var2;
                VarHandle.storeStoreFence();
                ir1Var4.m6905n0(c0725hh);
                obj2 = c0725hh;
            }
            obj2 = objM6869O6;
            lb5.m7932m(ju4.f22634a, (wp1) obj2, ir1Var4);
            ir1Var4.m6912r(false);
            ir1Var2 = ir1Var4;
        }
        int i4 = (i & 112) ^ 48;
        boolean z2 = (i4 > 32 && ir1Var2.m6890g(str2)) || (i & 48) == 32;
        Object objM6869O7 = ir1Var2.m6869O();
        Object obj6 = objM6869O7;
        if (z2 || objM6869O7 == i50Var) {
            C0590dx c0590dx = new C0590dx((byte) 0);
            c0590dx.f17475e = str2;
            c0590dx.f17472b = dz0VarM10705T;
            c0590dx.f17473c = sw2VarM7369C;
            c0590dx.f17474d = sw2Var2;
            VarHandle.storeStoreFence();
            wy0 wy0VarM10566b = s94.m10566b(c0590dx);
            ir1Var2.m6905n0(wy0VarM10566b);
            obj6 = wy0VarM10566b;
        }
        xb4 xb4Var = (xb4) obj6;
        if (xn2Var != null) {
            ir1Var2.m6885d0(-407777089);
            boolean zM6890g2 = ir1Var2.m6890g(sw2VarM7369C) | ir1Var2.m6890g(dz0VarM10705T) | ir1Var2.m6890g(xb4Var) | ir1Var2.m6894i(xn2Var);
            Object objM6869O8 = ir1Var2.m6869O();
            if (zM6890g2 || objM6869O8 == i50Var) {
                C0980oe c0980oe = new C0980oe(dz0VarM10705T, sw2VarM7369C, sw2Var2, xb4Var, xn2Var, null, (byte) 1);
                ir1Var2.m6905n0(c0980oe);
                objM6869O8 = c0980oe;
            }
            lb5.m7926g(ir1Var2, (mq1) objM6869O8, str2);
            i3 = 0;
            ir1Var2.m6912r(false);
        } else {
            i3 = 0;
            ir1Var2.m6885d0(-407533956);
            ir1Var2.m6912r(false);
        }
        int i5 = 1;
        mq1 mq1VarM7087c = je0.m7087c(z, ir1Var2, 1);
        z93 z93VarM10793B = sj3.m10793B(ir1Var2, i3, 1);
        C0712h4 c0712h4 = new C0712h4((byte) 3);
        c0712h4.f20357b = g12Var;
        c0712h4.f20358c = nt2Var2;
        c0712h4.f20359d = xb4Var;
        VarHandle.storeStoreFence();
        pg0 pg0VarM11834R = vd6.m11834R(-171825981, c0712h4, ir1Var2);
        int i6 = (ir1Var2.m6890g(z93VarM10793B) ? 1 : 0) | (ir1Var2.m6890g(xb4Var) ? 1 : 0) | (ir1Var2.m6890g(c0459am) ? 1 : 0) | (ir1Var2.m6890g(c1354y3) ? 1 : 0) | (ir1Var2.m6890g(sw2Var) ? 1 : 0) | (ir1Var2.m6894i(context) ? 1 : 0) | (ir1Var2.m6894i(mq1VarM7087c) ? 1 : 0);
        if ((i4 <= 32 || !ir1Var2.m6890g(str2)) && (i & 48) != 32) {
            i5 = i3;
        }
        int i7 = i6 | i5;
        Object objM6869O9 = ir1Var2.m6869O();
        if (i7 != 0 || objM6869O9 == i50Var) {
            C0704gx c0704gx = new C0704gx(z93VarM10793B, c0459am, wp1Var, context, mq1VarM7087c, str2, xb4Var, c1354y3, sw2Var, null);
            ir1Var2.m6905n0(c0704gx);
            objM6869O9 = c0704gx;
        }
        return ln0.m8039a(str, null, pg0VarM11834R, null, null, (yp1) objM6869O9, 90);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i0 */
    public static final Object m10727i0(long j, mq1 mq1Var, ym0 ym0Var) {
        bn4 bn4Var;
        ql3 ql3Var;
        if (ym0Var instanceof bn4) {
            bn4Var = (bn4) ym0Var;
            int i = bn4Var.f15439v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bn4Var.f15439v = i - Integer.MIN_VALUE;
            } else {
                bn4Var = new bn4(ym0Var);
            }
        } else {
            bn4Var = new bn4(ym0Var);
        }
        Object obj = bn4Var.f15438u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = bn4Var.f15439v;
        if (i2 == 0) {
            k43.m7376J(obj);
            if (j > 0) {
                ql3 ql3Var2 = new ql3();
                try {
                    bn4Var.f15437t = ql3Var2;
                    bn4Var.f15439v = 1;
                    try {
                        an4 an4Var = new an4(bn4Var, bn4Var.getContext());
                        an4Var.f14643f = j;
                        VarHandle.storeStoreFence();
                        ql3Var2.f28555a = an4Var;
                        Object objM10710Y = m10710Y(an4Var, mq1Var);
                        return objM10710Y == ap0Var ? ap0Var : objM10710Y;
                    } catch (zm4 e) {
                        e = e;
                        ql3Var = ql3Var2;
                        if (e.f36187a != ql3Var.f28555a) {
                            throw e;
                        }
                        return null;
                    }
                } catch (zm4 e2) {
                    e = e2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ql3Var = bn4Var.f15437t;
        try {
            k43.m7376J(obj);
            return obj;
        } catch (zm4 e3) {
            e = e3;
        }
        if (e.f36187a != ql3Var.f28555a) {
            throw e;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static synchronized long m10728j(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: j0 */
    public static final Object m10729j0(long j, mq1 mq1Var, ym0 ym0Var) {
        return m10727i0(d24.m4297L(j), mq1Var, ym0Var);
    }

    /* JADX INFO: renamed from: k */
    public static void m10730k(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                xy4.m12782k(c75.m3877i(i2, "at index "));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m10731l(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m10732m(AccessibilityNodeInfo accessibilityNodeInfo, ArrayList arrayList) {
        if (z62.m13387o(accessibilityNodeInfo.getViewIdResourceName(), "com.snapchat.android:id/camera_mode_icon_image_view")) {
            arrayList.add(accessibilityNodeInfo);
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null) {
                m10732m(child, arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m10733n(iu1 iu1Var, tw4 tw4Var) {
        ArrayList arrayList = tw4Var.f31501j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vw4 vw4Var = (vw4) arrayList.get(i);
            if (vw4Var instanceof xw4) {
                q83 q83Var = new q83();
                q83Var.f28285c = 1.0f;
                int i2 = uw4.f32218a;
                q83Var.f28286d = v71.f32439a;
                q83Var.f28287e = 1.0f;
                q83Var.f28290h = 0;
                q83Var.f28291i = 0;
                q83Var.f28292j = 4.0f;
                q83Var.f28294l = 1.0f;
                q83Var.f28296n = true;
                q83Var.f28297o = true;
                C0489bf c0489bfM4495a = AbstractC0573df.m4495a();
                q83Var.f28300r = c0489bfM4495a;
                q83Var.f28301s = c0489bfM4495a;
                q83Var.f28303u = i25.m6630z(aj2.f14537b, new da2((byte) 22));
                VarHandle.storeStoreFence();
                xw4 xw4Var = (xw4) vw4Var;
                q83Var.f28286d = xw4Var.f34673b;
                q83Var.f28296n = true;
                q83Var.m7329c();
                q83Var.f28301s.f15228a.setFillType(xw4Var.f34674c == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
                q83Var.m7329c();
                q83Var.m7329c();
                q83Var.f28284b = xw4Var.f34675d;
                q83Var.m7329c();
                q83Var.f28285c = xw4Var.f34676e;
                q83Var.m7329c();
                q83Var.f28289g = xw4Var.f34677f;
                q83Var.m7329c();
                q83Var.f28287e = xw4Var.f34678g;
                q83Var.m7329c();
                q83Var.f28288f = xw4Var.f34679h;
                q83Var.f28297o = true;
                q83Var.m7329c();
                q83Var.f28290h = xw4Var.f34680i;
                q83Var.f28297o = true;
                q83Var.m7329c();
                q83Var.f28291i = xw4Var.f34681j;
                q83Var.f28297o = true;
                q83Var.m7329c();
                q83Var.f28292j = xw4Var.f34682k;
                q83Var.f28297o = true;
                q83Var.m7329c();
                q83Var.f28293k = xw4Var.f34683l;
                q83Var.f28298p = true;
                q83Var.m7329c();
                q83Var.f28294l = xw4Var.f34684m;
                q83Var.f28298p = true;
                q83Var.m7329c();
                q83Var.f28295m = xw4Var.f34685n;
                q83Var.f28298p = true;
                q83Var.m7329c();
                iu1Var.m6937e(i, q83Var);
            } else if (vw4Var instanceof tw4) {
                iu1 iu1Var2 = new iu1();
                tw4 tw4Var2 = (tw4) vw4Var;
                iu1Var2.f21795k = tw4Var2.f31492a;
                iu1Var2.m7329c();
                iu1Var2.f21796l = tw4Var2.f31493b;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21799o = tw4Var2.f31496e;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21800p = tw4Var2.f31497f;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21801q = tw4Var2.f31498g;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21802r = tw4Var2.f31499h;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21797m = tw4Var2.f31494c;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21798n = tw4Var2.f31495d;
                iu1Var2.f21803s = true;
                iu1Var2.m7329c();
                iu1Var2.f21790f = tw4Var2.f31500i;
                iu1Var2.f21791g = true;
                iu1Var2.m7329c();
                m10733n(iu1Var2, tw4Var2);
                iu1Var.m6937e(i, iu1Var2);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static qu3 m10734o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            qu3 qu3Var = new qu3();
            new LinkedHashMap();
            qu3Var.f28818a = new C1122rv(w71.f33134a);
            return qu3Var;
        }
        bundle.setClassLoader(qu3.class.getClassLoader());
        sp2 sp2Var = new sp2(bundle.size());
        for (String str : bundle.keySet()) {
            sp2Var.put(str, bundle.get(str));
        }
        sp2 sp2VarM10893b = sp2Var.m10893b();
        qu3 qu3Var2 = new qu3();
        new LinkedHashMap();
        qu3Var2.f28818a = new C1122rv(sp2VarM10893b);
        return qu3Var2;
    }

    /* JADX INFO: renamed from: p */
    public static Object m10735p(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            C1077qn.m9987m(c75.m3877i(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: q */
    public static void m10736q(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: r */
    public static final long m10737r(long j, float f) {
        return ji1.m7130a(m10691D(j) / f, m10692E(j) / f);
    }

    /* JADX INFO: renamed from: s */
    public static final float m10738s(long j, long j2) {
        return (m10692E(j2) * m10692E(j)) + (m10691D(j2) * m10691D(j));
    }

    /* JADX INFO: renamed from: t */
    public static void m10739t(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    /* JADX INFO: renamed from: u */
    public static final AccessibilityNodeInfo m10740u(AccessibilityNodeInfo accessibilityNodeInfo) {
        AccessibilityNodeInfo accessibilityNodeInfoM10740u;
        if (accessibilityNodeInfo.isClickable()) {
            return accessibilityNodeInfo;
        }
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i);
            if (child != null && (accessibilityNodeInfoM10740u = m10740u(child)) != null) {
                return accessibilityNodeInfoM10740u;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static s60 m10741v(int i) {
        so1 so1Var = so1.f30419k;
        float fM7623x = ks5.m7623x((i >> 16) & 255);
        float fM7623x2 = ks5.m7623x((i >> 8) & 255);
        float fM7623x3 = ks5.m7623x(i & 255);
        double[][] dArr = ks5.f23396e;
        double d = fM7623x;
        double[] dArr2 = dArr[0];
        double d2 = fM7623x2;
        double d3 = fM7623x3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = ks5.f23393b;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float[] fArr6 = so1Var.f30426g;
        float f9 = so1Var.f30424e;
        float f10 = so1Var.f30421b;
        float f11 = fArr6[0] * f6;
        float f12 = fArr6[1] * f7;
        float f13 = fArr6[2] * f8;
        float f14 = so1Var.f30427h;
        float fPow = (float) Math.pow((Math.abs(f11) * f14) / 100.0f, 0.41999998688697815d);
        float fPow2 = (float) Math.pow((Math.abs(f12) * f14) / 100.0f, 0.41999998688697815d);
        float fPow3 = (float) Math.pow((Math.abs(f13) * f14) / 100.0f, 0.41999998688697815d);
        float fSignum = ((Math.signum(f11) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f12) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f13) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        float f15 = ((((-12.0f) * fSignum2) + (fSignum * 11.0f)) + fSignum3) / 11.0f;
        float f16 = ((fSignum + fSignum2) - (fSignum3 * 2.0f)) / 9.0f;
        float f17 = fSignum2 * 20.0f;
        float f18 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f17)) / 20.0f;
        float f19 = (((fSignum * 40.0f) + f17) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f20 = fAtan2;
        float f21 = (f20 * 3.1415927f) / 180.0f;
        float fPow4 = ((float) Math.pow((f19 * so1Var.f30422c) / f10, so1Var.f30429j * f9)) * 100.0f;
        float fPow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * so1Var.f30425f) * so1Var.f30423d) * ((float) Math.sqrt((f16 * f16) + (f15 * f15)))) / (f18 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, so1Var.f30420a)), 0.7300000190734863d));
        float fSqrt = fPow5 * ((float) Math.sqrt(fPow4 / 100.0f));
        float f22 = so1Var.f30428i * fSqrt;
        Math.sqrt((fPow5 * f9) / (f10 + 4.0f));
        float f23 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f21;
        return new s60(f20, fSqrt, fPow4, f23, fLog * ((float) Math.cos(d6)), fLog * ((float) Math.sin(d6)));
    }

    /* JADX INFO: renamed from: w */
    public static s60 m10742w(float f, float f2, float f3) {
        so1 so1Var = so1.f30419k;
        float f4 = so1Var.f30428i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(((double) f) / 100.0d))) * so1Var.f30424e) / (so1Var.f30421b + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f4) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new s60(f3, f2, f, f5, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX INFO: renamed from: x */
    public static final int m10743x(Bitmap bitmap) {
        int i;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config = bitmap.getConfig();
                if (config == Bitmap.Config.ALPHA_8) {
                    i = 1;
                } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                    i = 2;
                } else {
                    i = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
                }
                return height * i;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config2 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config2);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: y */
    public static int m10744y() {
        boolean zM10697J = m10697J();
        ?? r0 = zM10697J;
        if (m10698K()) {
            r0 = (zM10697J ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    /* JADX INFO: renamed from: z */
    public static final float m10745z(long j) {
        return (float) Math.sqrt((m10692E(j) * m10692E(j)) + (m10691D(j) * m10691D(j)));
    }

    /* JADX INFO: renamed from: A */
    public Integer mo4966A() {
        return null;
    }

    /* JADX INFO: renamed from: B */
    public abstract t73 mo3664B();

    /* JADX INFO: renamed from: P */
    public abstract View mo8456P(int i);

    /* JADX INFO: renamed from: Q */
    public abstract boolean mo8457Q();
}
