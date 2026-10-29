package p000;

import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ym3 implements i44 {

    /* JADX INFO: renamed from: a */
    public sg1 f35329a;

    /* JADX INFO: renamed from: b */
    public zm3 f35330b;

    /* JADX INFO: renamed from: c */
    public og2 f35331c;

    /* JADX INFO: renamed from: d */
    public gx2 f35332d;

    @Override // p000.i44
    /* JADX INFO: renamed from: a */
    public final Boolean mo6660a() {
        w24 w24Var = m13174e().f17689b;
        if (w24Var != null) {
            return w24Var.f33044a;
        }
        z62.m13366Y("sessionConfigs");
        throw null;
    }

    @Override // p000.i44
    /* JADX INFO: renamed from: b */
    public final Double mo6661b() {
        w24 w24Var = m13174e().f17689b;
        if (w24Var != null) {
            return w24Var.f33045b;
        }
        z62.m13366Y("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:42:0x00ac, B:44:0x00b6, B:47:0x00bf, B:34:0x0087, B:36:0x0091, B:39:0x009a), top: B:60:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0057, blocks: (B:21:0x0053, B:42:0x00ac, B:44:0x00b6, B:47:0x00bf, B:34:0x0087, B:36:0x0091, B:39:0x009a), top: B:60:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // p000.i44
    /* JADX INFO: renamed from: c */
    public final Object mo6662c(wm0 wm0Var) throws Throwable {
        xm3 xm3Var;
        gx2 gx2Var;
        String str;
        Object objM7921b0;
        ym3 ym3Var = this;
        gx2 gx2Var2 = ym3Var.f35332d;
        if (wm0Var instanceof xm3) {
            xm3Var = (xm3) wm0Var;
            int i = xm3Var.f34424x;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm3Var.f34424x = i - Integer.MIN_VALUE;
            } else {
                xm3Var = new xm3(ym3Var, (ym0) wm0Var);
            }
        } else {
            xm3Var = new xm3(ym3Var, (ym0) wm0Var);
        }
        Object objM6671f = xm3Var.f34422v;
        ap0 ap0Var = ap0.f14763a;
        int i2 = xm3Var.f34424x;
        int i3 = 2;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var2 = null;
        try {
            if (i2 == 0) {
                k43.m7376J(objM6671f);
                if (!gx2Var2.m6190d() && !ym3Var.m13174e().m4917a()) {
                    return ju4Var;
                }
                xm3Var.f34420t = ym3Var;
                xm3Var.f34421u = gx2Var2;
                xm3Var.f34424x = 1;
                if (gx2Var2.m6191e(xm3Var) != ap0Var) {
                }
                return ap0Var;
            }
            if (i2 == 1) {
                gx2Var2 = xm3Var.f34421u;
                ym3Var = (ym3) xm3Var.f34420t;
                k43.m7376J(objM6671f);
            } else {
                if (i2 == 2) {
                    gx2Var2 = xm3Var.f34421u;
                    ym3Var = (ym3) xm3Var.f34420t;
                    k43.m7376J(objM6671f);
                    str = ((u42) objM6671f).f31649a;
                    if (str.equals("")) {
                        Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        gx2Var2.m6193g(null);
                        return ju4Var;
                    }
                    l73 l73Var = new l73("X-Crashlytics-Installation-ID", str);
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    ym3Var.getClass();
                    Map mapM5274M = eq2.m5274M(l73Var, new l73("X-Crashlytics-Device-Model", Pattern.compile("/").matcher(str2).replaceAll("")), new l73("X-Crashlytics-OS-Build-Version", Pattern.compile("/").matcher(Build.VERSION.INCREMENTAL).replaceAll("")), new l73("X-Crashlytics-OS-Display-Version", Pattern.compile("/").matcher(Build.VERSION.RELEASE).replaceAll("")), new l73("X-Crashlytics-API-Client-Version", "2.1.2"));
                    Log.d("SessionConfigFetcher", "Fetching settings from server.");
                    zm3 zm3Var = ym3Var.f35330b;
                    C1312wz c1312wz = new C1312wz((Object) ym3Var, wm0Var2, (byte) 6);
                    C1108rh c1108rh = new C1108rh(i3, wm0Var2, (byte) 5);
                    xm3Var.f34420t = gx2Var2;
                    xm3Var.f34421u = null;
                    xm3Var.f34424x = 3;
                    objM7921b0 = lb5.m7921b0(zm3Var.f36186b, new C1312wz(zm3Var, mapM5274M, c1312wz, c1108rh, (wm0) null), xm3Var);
                    if (objM7921b0 != ap0Var) {
                        objM7921b0 = ju4Var;
                    }
                    if (objM7921b0 != ap0Var) {
                        gx2Var = gx2Var2;
                    }
                    return ap0Var;
                }
                if (i2 != 3) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gx2Var = (gx2) xm3Var.f34420t;
                try {
                    k43.m7376J(objM6671f);
                } catch (Throwable th) {
                    th = th;
                    gx2Var.m6193g(null);
                    throw th;
                }
            }
            gx2Var.m6193g(null);
            return ju4Var;
            if (!ym3Var.m13174e().m4917a()) {
                Log.d("SessionConfigFetcher", "Remote settings cache not expired. Using cached values.");
                gx2Var2.m6193g(null);
                return ju4Var;
            }
            i50 i50Var = u42.f31648c;
            sg1 sg1Var = ym3Var.f35329a;
            xm3Var.f34420t = ym3Var;
            xm3Var.f34421u = gx2Var2;
            xm3Var.f34424x = 2;
            objM6671f = i50Var.m6671f(sg1Var, xm3Var);
            if (objM6671f != ap0Var) {
                str = ((u42) objM6671f).f31649a;
                if (str.equals("")) {
                    Log.w("SessionConfigFetcher", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    gx2Var2.m6193g(null);
                    return ju4Var;
                }
                l73 l73Var2 = new l73("X-Crashlytics-Installation-ID", str);
                String str3 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                ym3Var.getClass();
                Map mapM5274M2 = eq2.m5274M(l73Var2, new l73("X-Crashlytics-Device-Model", Pattern.compile("/").matcher(str3).replaceAll("")), new l73("X-Crashlytics-OS-Build-Version", Pattern.compile("/").matcher(Build.VERSION.INCREMENTAL).replaceAll("")), new l73("X-Crashlytics-OS-Display-Version", Pattern.compile("/").matcher(Build.VERSION.RELEASE).replaceAll("")), new l73("X-Crashlytics-API-Client-Version", "2.1.2"));
                Log.d("SessionConfigFetcher", "Fetching settings from server.");
                zm3 zm3Var2 = ym3Var.f35330b;
                C1312wz c1312wz2 = new C1312wz((Object) ym3Var, wm0Var2, (byte) 6);
                C1108rh c1108rh2 = new C1108rh(i3, wm0Var2, (byte) 5);
                xm3Var.f34420t = gx2Var2;
                xm3Var.f34421u = null;
                xm3Var.f34424x = 3;
                objM7921b0 = lb5.m7921b0(zm3Var2.f36186b, new C1312wz(zm3Var2, mapM5274M2, c1312wz2, c1108rh2, (wm0) null), xm3Var);
                if (objM7921b0 != ap0Var) {
                    objM7921b0 = ju4Var;
                }
                if (objM7921b0 != ap0Var) {
                    gx2Var = gx2Var2;
                    gx2Var.m6193g(null);
                    return ju4Var;
                }
            }
            return ap0Var;
        } catch (Throwable th2) {
            th = th2;
            gx2Var = gx2Var2;
        }
    }

    @Override // p000.i44
    /* JADX INFO: renamed from: d */
    public final i41 mo6663d() {
        w24 w24Var = m13174e().f17689b;
        if (w24Var == null) {
            z62.m13366Y("sessionConfigs");
            throw null;
        }
        Integer num = w24Var.f33046c;
        if (num == null) {
            return null;
        }
        r50 r50Var = i41.f21117b;
        return i41.m6644c(as4.m3238Q(num.intValue(), m41.SECONDS));
    }

    /* JADX INFO: renamed from: e */
    public final e44 m13174e() {
        return (e44) this.f35331c.get();
    }
}
