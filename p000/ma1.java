package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Vibrator;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import essentials.app.EsApp;
import java.lang.invoke.VarHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma1 implements mq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24780a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ EsApp f24781b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ mq1 f24782c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ C0459am f24783d;

    public /* synthetic */ ma1(byte b) {
        this.f24780a = b;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, PackageManager.NameNotFoundException, InvocationTargetException {
        df2 df2Var;
        Object obj3;
        xn2 xn2Var;
        byte b = this.f24780a;
        i50 i50Var = ki0.f23136a;
        ju4 ju4Var = ju4.f22634a;
        wm0 wm0Var = null;
        byte b2 = 2;
        byte b3 = 0;
        switch (b) {
            case 0:
                EsApp esApp = this.f24781b;
                mq1 mq1Var = this.f24782c;
                C0459am c0459am = this.f24783d;
                mi0 mi0Var = (mi0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = EsApp.f18450c;
                ir1 ir1Var = (ir1) mi0Var;
                if (!ir1Var.m6871T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ir1Var.m6874W();
                    return ju4Var;
                }
                Object objM6869O = ir1Var.m6869O();
                if (objM6869O == i50Var) {
                    String string = esApp.getPackageManager().getApplicationInfo(esApp.getPackageName(), 128).metaData.getString("es_entrypoint");
                    if (string == null) {
                        C1077qn.m9989o("No entry point specified");
                        return null;
                    }
                    String strM6356v0 = hd4.m6356v0(string, '.');
                    String strM6355u0 = hd4.m6355u0('.', string, string);
                    Method[] declaredMethods = Class.forName(strM6356v0).getDeclaredMethods();
                    int length = declaredMethods.length;
                    int i2 = 0;
                    boolean z = false;
                    Method method = null;
                    while (true) {
                        if (i2 < length) {
                            Method method2 = declaredMethods[i2];
                            if (z62.m13387o(method2.getName(), strM6355u0)) {
                                if (!z) {
                                    method = method2;
                                    z = true;
                                }
                            }
                            i2++;
                        } else if (!z) {
                        }
                        method = null;
                    }
                    if (method == null) {
                        throw new IllegalStateException(("No unique @Composable method named " + strM6355u0 + " in " + strM6356v0).toString());
                    }
                    ir1Var.m6905n0(method);
                    objM6869O = method;
                }
                ne0 ne0Var = new ne0((byte) 25);
                ne0Var.f25728b = mq1Var;
                ne0Var.f25729c = c0459am;
                VarHandle.storeStoreFence();
                ((Method) objM6869O).invoke(null, vd6.m11834R(1908960217, ne0Var, ir1Var), ir1Var, 0);
                return ju4Var;
            case 1:
                EsApp esApp2 = this.f24781b;
                mq1 mq1Var2 = this.f24782c;
                C0459am c0459am2 = this.f24783d;
                mi0 mi0Var2 = (mi0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i3 = EsApp.f18450c;
                ir1 ir1Var2 = (ir1) mi0Var2;
                if (ir1Var2.m6871T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ma1 ma1Var = new ma1(b2);
                    ma1Var.f24781b = esApp2;
                    ma1Var.f24782c = mq1Var2;
                    ma1Var.f24783d = c0459am2;
                    VarHandle.storeStoreFence();
                    AbstractC1335xl.m12703a(vd6.m11834R(-757229768, ma1Var, ir1Var2), ir1Var2, 6);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 2:
                EsApp esApp3 = this.f24781b;
                mq1 mq1Var3 = this.f24782c;
                C0459am c0459am3 = this.f24783d;
                mi0 mi0Var3 = (mi0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i4 = EsApp.f18450c;
                ir1 ir1Var3 = (ir1) mi0Var3;
                if (ir1Var3.m6871T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Object objM6869O2 = ir1Var3.m6869O();
                    if (objM6869O2 == i50Var) {
                        objM6869O2 = k43.m7398w(new Configuration(esApp3.getResources().getConfiguration()));
                        ir1Var3.m6905n0(objM6869O2);
                    }
                    sw2 sw2Var = (sw2) objM6869O2;
                    boolean zM6894i = ir1Var3.m6894i(esApp3);
                    Object objM6869O3 = ir1Var3.m6869O();
                    Object obj4 = objM6869O3;
                    if (zM6894i || objM6869O3 == i50Var) {
                        na1 na1Var = new na1((byte) 0);
                        na1Var.f25595b = esApp3;
                        na1Var.f25596c = sw2Var;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(na1Var);
                        obj4 = na1Var;
                    }
                    lb5.m7923d(ju4Var, (yp1) obj4, ir1Var3);
                    xh3 xh3VarM9168a = AbstractC0987ol.m9168a();
                    nc4 nc4Var = AndroidCompositionLocals_androidKt.f14651b;
                    Context context = (Context) ir1Var3.m6898k(nc4Var);
                    Object objM6869O4 = ir1Var3.m6869O();
                    if (objM6869O4 == i50Var) {
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 0);
                        boolean z2 = (applicationInfo.flags & 2) == 2;
                        String string2 = applicationInfo.loadLabel(context.getPackageManager()).toString();
                        String str = applicationInfo.packageName;
                        String str2 = packageInfo.versionName;
                        int i5 = packageInfo.versionCode;
                        int i6 = Build.VERSION.SDK_INT;
                        C0950nl c0950nl = new C0950nl();
                        c0950nl.f25920a = z2;
                        c0950nl.f25921b = string2;
                        c0950nl.f25922c = str;
                        c0950nl.f25923d = str2;
                        c0950nl.f25924e = i5;
                        c0950nl.f25925f = i6;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(c0950nl);
                        objM6869O4 = c0950nl;
                    }
                    zh3 zh3VarMo7523a = xh3VarM9168a.mo7523a((C0950nl) objM6869O4);
                    zh3 zh3VarMo7523a2 = AndroidCompositionLocals_androidKt.f14650a.mo7523a((Configuration) sw2Var.getValue());
                    nc4 nc4Var2 = ij0.f21473h;
                    boolean zM6890g = ir1Var3.m6890g((Configuration) sw2Var.getValue());
                    Object objM6869O5 = ir1Var3.m6869O();
                    if (zM6890g || objM6869O5 == i50Var) {
                        objM6869O5 = gq6.m6078c(esApp3);
                        ir1Var3.m6905n0(objM6869O5);
                    }
                    zh3 zh3VarMo7523a3 = nc4Var2.mo7523a((ky0) objM6869O5);
                    nc4 nc4Var3 = nv1.f26110a;
                    Context context2 = (Context) ir1Var3.m6898k(nc4Var);
                    Object objM6869O6 = ir1Var3.m6869O();
                    Object obj5 = objM6869O6;
                    if (objM6869O6 == i50Var) {
                        Vibrator vibrator = (Vibrator) context2.getSystemService(Vibrator.class);
                        if (vibrator == null || !vibrator.hasVibrator()) {
                            vibrator = null;
                        }
                        lv1 lv1Var = new lv1();
                        lv1Var.f24388a = vibrator;
                        VarHandle.storeStoreFence();
                        ir1Var3.m6905n0(lv1Var);
                        obj5 = lv1Var;
                    }
                    zh3 zh3VarMo7523a4 = nc4Var3.mo7523a((lv1) obj5);
                    nc4 nc4Var4 = ij0.f21479n;
                    int layoutDirection = ((Configuration) sw2Var.getValue()).getLayoutDirection();
                    int[] iArr = wk1.f33443a;
                    if (layoutDirection != 0) {
                        df2Var = layoutDirection != 1 ? null : df2.f17012b;
                    } else {
                        df2Var = df2.f17011a;
                    }
                    if (df2Var == null) {
                        df2Var = df2.f17011a;
                    }
                    zh3[] zh3VarArr = {zh3VarMo7523a, zh3VarMo7523a2, zh3VarMo7523a3, zh3VarMo7523a4, nc4Var4.mo7523a(df2Var)};
                    ma1 ma1Var2 = new ma1((byte) 3);
                    ma1Var2.f24781b = esApp3;
                    ma1Var2.f24782c = mq1Var3;
                    ma1Var2.f24783d = c0459am3;
                    VarHandle.storeStoreFence();
                    as4.m3245d(zh3VarArr, vd6.m11834R(530397816, ma1Var2, ir1Var3), ir1Var3, 48);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            default:
                EsApp esApp4 = this.f24781b;
                mq1 mq1Var4 = this.f24782c;
                C0459am c0459am4 = this.f24783d;
                mi0 mi0Var4 = (mi0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i7 = EsApp.f18450c;
                ir1 ir1Var4 = (ir1) mi0Var4;
                if (ir1Var4.m6871T(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    C1409zl c1409zl = (C1409zl) ir1Var4.m6898k(wz0.f33871a);
                    boolean zM6890g2 = ir1Var4.m6890g(c1409zl);
                    Object objM6869O7 = ir1Var4.m6869O();
                    if (zM6890g2 || objM6869O7 == i50Var) {
                        obj3 = objM6869O7;
                        C0834kg c0834kg = new C0834kg((byte) 0);
                        c0834kg.f23102b = c1409zl;
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0834kg);
                        obj3 = c0834kg;
                    }
                    wp1 wp1Var = (wp1) obj3;
                    C0459am c0459am5 = (C0459am) ir1Var4.m6898k(AbstractC0496bm.m3626a());
                    Object objM6869O8 = ir1Var4.m6869O();
                    if (objM6869O8 == i50Var) {
                        objM6869O8 = lb5.m7942w(c0459am5.f14621c, ir1Var4);
                        ir1Var4.m6905n0(objM6869O8);
                    }
                    zo0 zo0Var = (zo0) objM6869O8;
                    boolean zM6890g3 = ir1Var4.m6890g(wp1Var) | ir1Var4.m6890g(zo0Var);
                    Object objM6869O9 = ir1Var4.m6869O();
                    if (zM6890g3 || objM6869O9 == i50Var) {
                        objM6869O9 = wv1.m12423m(null, zo0Var, wp1Var, 3);
                        ir1Var4.m6905n0(objM6869O9);
                    }
                    lt0 lt0Var = (lt0) objM6869O9;
                    i92 i92Var = (i92) ir1Var4.m6898k(hj0.f20620b);
                    xn2 xn2Var2 = (xn2) ir1Var4.m6898k(yn2.f35357b);
                    if (xn2Var2 == null) {
                        ir1Var4.m6885d0(-1476823888);
                        ir1Var4.m6912r(false);
                        xn2Var = null;
                    } else {
                        ir1Var4.m6885d0(-1476823887);
                        boolean zM6890g4 = ir1Var4.m6890g("PreferencesDataStore") | ir1Var4.m6890g(xn2Var2);
                        Object objM6869O10 = ir1Var4.m6869O();
                        if (zM6890g4 || objM6869O10 == i50Var) {
                            objM6869O10 = xn2Var2.m12723c("PreferencesDataStore");
                            ir1Var4.m6905n0(objM6869O10);
                        }
                        xn2Var = (xn2) objM6869O10;
                        ir1Var4.m6912r(false);
                    }
                    Object objM6869O11 = ir1Var4.m6869O();
                    r71 r71Var = r71.f29063a;
                    Object obj6 = objM6869O11;
                    if (objM6869O11 == i50Var) {
                        C1033pg c1033pg = new C1033pg();
                        c1033pg.f27583a = (hw2) y70.m13014O(r71Var, new C0982og(lt0Var, wm0Var, b3));
                        ir1Var4.m6905n0(c1033pg);
                        obj6 = c1033pg;
                    }
                    C1033pg c1033pg2 = (C1033pg) obj6;
                    Object objM6869O12 = ir1Var4.m6869O();
                    if (objM6869O12 == i50Var) {
                        objM6869O12 = lb5.m7942w(r71Var, ir1Var4);
                        ir1Var4.m6905n0(objM6869O12);
                    }
                    zo0 zo0Var2 = (zo0) objM6869O12;
                    Object objM6869O13 = ir1Var4.m6869O();
                    Object obj7 = objM6869O13;
                    if (objM6869O13 == i50Var) {
                        C0945ng c0945ng = new C0945ng();
                        c0945ng.f25757b = xn2Var;
                        c0945ng.f25758c = zo0Var2;
                        c0945ng.f25759d = c1033pg2;
                        c0945ng.f25760e = lt0Var;
                        c0945ng.f25761f = i92Var;
                        c0945ng.f25756a = new HashMap();
                        VarHandle.storeStoreFence();
                        ir1Var4.m6905n0(c0945ng);
                        obj7 = c0945ng;
                    }
                    C0945ng c0945ng2 = (C0945ng) obj7;
                    zh3 zh3VarMo7523a5 = h44.m6217a().mo7523a(c0945ng2);
                    C0613ei c0613ei = new C0613ei((byte) 5);
                    c0613ei.f18113c = c0945ng2;
                    c0613ei.f18114d = esApp4;
                    c0613ei.f18115e = mq1Var4;
                    c0613ei.f18112b = c0459am4;
                    VarHandle.storeStoreFence();
                    as4.m3244c(zh3VarMo7523a5, vd6.m11834R(510545336, c0613ei, ir1Var4), ir1Var4, 56);
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
        }
    }
}
