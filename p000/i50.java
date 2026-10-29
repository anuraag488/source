package p000;

import ads_mobile_sdk.t21;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class i50 implements m50, jm0, w81, ai3, jf3, hp0, cr0, qo0, t65 {

    /* JADX INFO: renamed from: b */
    public static volatile i50 f21130b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21131a;

    public /* synthetic */ i50(byte b) {
        this.f21131a = b;
    }

    /* JADX INFO: renamed from: e */
    public static long m6665e(as0 as0Var, float f) {
        float[] fArr = as0Var.f14841a;
        int i = 1;
        long jM7130a = ji1.m7130a(fArr[0], fArr[1]);
        float f2 = 0.0f;
        float f3 = f;
        while (true) {
            float f4 = i / 3.0f;
            long jM3217c = as0Var.m3217c(f4);
            float fM10745z = se0.m10745z(se0.m10700M(jM3217c, jM7130a));
            if (fM10745z >= f3) {
                return ji1.m7130a(f4 - ((1.0f - (f3 / fM10745z)) / 3.0f), f);
            }
            f3 -= fM10745z;
            f2 += fM10745z;
            if (i == 3) {
                return ji1.m7130a(1.0f, f2);
            }
            i++;
            jM7130a = jM3217c;
        }
    }

    /* JADX INFO: renamed from: h */
    public static Font m6666h(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM6668j = m6668j(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iM6668j2 = m6668j(fontStyle, font2.getStyle());
            if (iM6668j2 < iM6668j) {
                font = font2;
                iM6668j = iM6668j2;
            }
        }
        return font;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX INFO: renamed from: i */
    public static FontFamily m6667i(zm1[] zm1VarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (zm1 zm1Var : zm1VarArr) {
            boolean zEquals = Objects.equals(zm1Var.f36176a.getScheme(), "systemfont");
            Uri uri = zm1Var.f36176a;
            String str = zm1Var.f36180e;
            if (zEquals) {
                String authority = Objects.equals(uri.getScheme(), "systemfont") ? uri.getAuthority() : null;
                if (authority == null) {
                    fontBuild = null;
                } else {
                    Typeface typefaceCreate = Typeface.create(authority, 0);
                    Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                    if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                        typefaceCreate = null;
                    }
                    if (typefaceCreate == null || (fontBuild = ds4.m4676b(typefaceCreate)) == null) {
                        fontBuild = null;
                    } else if (!TextUtils.isEmpty(str)) {
                        try {
                            fontBuild = new Font.Builder(fontBuild).setFontVariationSettings(str).build();
                        } catch (IOException unused) {
                            Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                            fontBuild = null;
                        }
                    }
                }
            } else {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(zm1Var.f36178c).setSlant(zm1Var.f36179d ? 1 : 0).setTtcIndex(zm1Var.f36177b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: j */
    public static int m6668j(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        t21 t21Var;
        switch (i) {
            case 0:
                t21Var = t21.f11839b;
                break;
            case 1:
                t21Var = t21.f11840c;
                break;
            case 2:
                t21Var = t21.f11841d;
                break;
            case 3:
                t21Var = t21.f11842e;
                break;
            case 4:
                t21Var = t21.f11843f;
                break;
            case 5:
                t21Var = t21.f11844g;
                break;
            case 6:
                t21Var = t21.f11845h;
                break;
            case 7:
                t21Var = t21.f11846i;
                break;
            case 8:
                t21Var = t21.f11847j;
                break;
            case 9:
                t21Var = t21.f11848k;
                break;
            default:
                t21Var = null;
                break;
        }
        return t21Var == null ? t21.f11849l : t21Var;
    }

    @Override // p000.m50
    /* JADX INFO: renamed from: b */
    public byte[] mo6669b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.jm0
    /* JADX INFO: renamed from: c */
    public long mo6670c(long j, long j2) {
        float fM13036p = y70.m13036p(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM13036p)) << 32) | (((long) Float.floatToRawIntBits(fM13036p)) & 4294967295L);
        int i = sv3.f30595a;
        return jFloatToRawIntBits;
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: d */
    public Object mo5607d(String str, Provider provider) {
        switch (this.f21131a) {
            case 6:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r7 == r9) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [sg1] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m6671f(sg1 sg1Var, ym0 ym0Var) {
        t42 t42Var;
        ?? r7;
        String str;
        ?? r8;
        if (ym0Var instanceof t42) {
            t42Var = (t42) ym0Var;
            int i = t42Var.f30777w;
            if ((i & Integer.MIN_VALUE) != 0) {
                t42Var.f30777w = i - Integer.MIN_VALUE;
            } else {
                t42Var = new t42(this, ym0Var);
            }
        } else {
            t42Var = new t42(this, ym0Var);
        }
        Object objM13388p = t42Var.f30775u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = t42Var.f30777w;
        String str2 = "";
        try {
            try {
                if (i2 == 0) {
                    k43.m7376J(objM13388p);
                    rg1 rg1Var = (rg1) sg1Var;
                    nr6 nr6VarM10332e = rg1Var.m10332e();
                    try {
                        t42Var.f30774t = rg1Var;
                        t42Var.f30777w = 1;
                        Object objM13388p2 = z62.m13388p(nr6VarM10332e, t42Var);
                        if (objM13388p2 != ap0Var) {
                            sg1Var = rg1Var;
                            objM13388p = objM13388p2;
                        }
                    } catch (Exception e) {
                        sg1Var = rg1Var;
                        e = e;
                        Log.w("InstallationId", "Error getting authentication token.", e);
                        r7 = sg1Var;
                        str = "";
                    }
                    return ap0Var;
                }
                if (i2 == 1) {
                    sg1 sg1Var2 = (sg1) t42Var.f30774t;
                    k43.m7376J(objM13388p);
                    sg1Var = sg1Var2;
                } else {
                    if (i2 != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) t42Var.f30774t;
                    k43.m7376J(objM13388p);
                    sg1Var = str3;
                }
                str2 = (String) objM13388p;
                r8 = sg1Var;
                u42 u42Var = new u42();
                u42Var.f31649a = str2;
                u42Var.f31650b = r8;
                VarHandle.storeStoreFence();
                return u42Var;
                ?? r6 = sg1Var;
                str = ((C0774iu) objM13388p).f21777a;
                r7 = r6;
            } catch (Exception e2) {
                Log.w("InstallationId", "Error getting Firebase installation id .", e2);
                r8 = sg1Var;
            }
        } catch (Exception e3) {
            e = e3;
        }
        nr6 nr6VarM10331c = ((rg1) r7).m10331c();
        t42Var.f30774t = str;
        t42Var.f30777w = 2;
        objM13388p = z62.m13388p(nr6VarM10331c, t42Var);
        sg1Var = str;
    }

    /* JADX INFO: renamed from: g */
    public Typeface m6672g(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM6667i = m6667i((zm1[]) list.get(0), contentResolver);
            if (fontFamilyM6667i == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM6667i);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyM6667i2 = m6667i((zm1[]) list.get(i2), contentResolver);
                if (fontFamilyM6667i2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM6667i2);
                }
            }
            return customFallbackBuilder.setStyle(m6666h(fontFamilyM6667i, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // p000.ai3
    public Object get() {
        return hw4.f20904a;
    }

    /* JADX INFO: renamed from: k */
    public void m6673k(Runnable runnable, String str) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        t93 t93Var = t93.f31011b;
        t93Var.getClass();
        AutoCloseable autoCloseable = q71.f28244a;
        boolean z = false;
        try {
            runnable.run();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                ds3.m4665g();
                return;
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                str.concat(".exception");
                gq6.m6065C(t93Var, th);
                throw null;
            } catch (Throwable th2) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else {
                    if (!(autoCloseable instanceof ExecutorService)) {
                        ds3.m4665g();
                        return;
                    }
                    ExecutorService executorService2 = (ExecutorService) autoCloseable;
                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                        executorService2.shutdown();
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                            } catch (InterruptedException unused2) {
                                if (!z) {
                                    executorService2.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
                throw th2;
            }
        }
    }

    public String toString() {
        switch (this.f21131a) {
            case 2:
                return "Empty";
            case 17:
                int iHashCode = hashCode();
                y62.m12992v(16);
                return zi4.m13622v("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rl3.m10361a(Bundle.class).m10249b(), ">");
            case 19:
                return "ReusedSlotId";
            case 22:
                int iHashCode2 = hashCode();
                y62.m12992v(16);
                return zi4.m13622v("CreationExtras.Key@", Integer.toString(iHashCode2, 16), "<", rl3.m10361a(Application.class).m10249b(), ">");
            default:
                return super.toString();
        }
    }

    @Override // p000.hp0
    /* JADX INFO: renamed from: a */
    public Object mo6468a(gp0 gp0Var) throws gp0 {
        throw gp0Var;
    }
}
