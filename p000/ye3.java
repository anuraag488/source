package p000;

import android.app.Activity;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ye3 implements qe3 {

    /* JADX INFO: renamed from: a */
    public wy0 f35162a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ ArrayList f35163b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ sl2 f35164c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ sw2 f35165d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ sw2 f35166e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ sw2 f35167f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ sw2 f35168g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ zo0 f35169h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ long f35170i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ List f35171j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ xz4 f35172k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ InterfaceC0755ia f35173l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ C0686gf f35174m;

    /* JADX INFO: renamed from: n */
    public /* synthetic */ wp1 f35175n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ yp1 f35176o;

    @Override // p000.qe3
    /* JADX INFO: renamed from: a */
    public final boolean mo9868a() {
        wp1 wp1Var = (wp1) this.f35165d.getValue();
        return (wp1Var != null && ((Boolean) wp1Var.invoke()).booleanValue()) || ((Boolean) this.f35166e.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p000.qe3
    /* JADX INFO: renamed from: b */
    public final Object mo9869b(wm0 wm0Var) {
        ve3 ve3Var;
        if (wm0Var instanceof ve3) {
            ve3Var = (ve3) wm0Var;
            int i = ve3Var.f32559v;
            if ((i & Integer.MIN_VALUE) != 0) {
                ve3Var.f32559v = i - Integer.MIN_VALUE;
            } else {
                ve3Var = new ve3(this, (ym0) wm0Var);
            }
        } else {
            ve3Var = new ve3(this, (ym0) wm0Var);
        }
        Object objM5007w = ve3Var.f32557t;
        ap0 ap0Var = ap0.f14763a;
        int i2 = ve3Var.f32559v;
        if (i2 == 0) {
            k43.m7376J(objM5007w);
            ic2[] ic2VarArr = zz2.f36502a;
            ju4 ju4Var = ju4.f22634a;
            Map mapSingletonMap = Collections.singletonMap("sheet", ju4Var);
            Map mapSingletonMap2 = Collections.singletonMap("no_full_screen_ad", ju4Var);
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapSingletonMap);
            linkedHashMap.putAll(mapSingletonMap2);
            long j = this.f35170i;
            List list = this.f35171j;
            sw2 sw2Var = this.f35167f;
            ue3 ue3Var = new ue3();
            ue3Var.f31808a = this;
            ue3Var.f31809b = j;
            ue3Var.f31810c = list;
            ue3Var.f31811d = sw2Var;
            VarHandle.storeStoreFence();
            ix0 ix0VarM7937r = lb5.m7937r(this.f35169h, null, new we3(this.f35172k, new kr3(linkedHashMap, new pg0(-606741043, true, ue3Var)), this.f35173l, this.f35174m, this.f35175n, j, this.f35166e, this.f35168g, null), 3);
            ve3Var.f32559v = 1;
            objM5007w = ix0VarM7937r.m5007w(ve3Var);
            if (objM5007w == ap0Var) {
                return ap0Var;
            }
        } else {
            if (i2 != 1) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(objM5007w);
        }
        return Boolean.valueOf(objM5007w != null);
    }

    @Override // p000.qe3
    /* JADX INFO: renamed from: c */
    public final boolean mo9870c() {
        return ((wp1) this.f35167f.getValue()) != null;
    }

    @Override // p000.qe3
    /* JADX INFO: renamed from: d */
    public final long mo9871d() {
        return ((i41) this.f35168g.getValue()).f21121a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.qe3
    /* JADX INFO: renamed from: e */
    public final Object mo9872e(yp1 yp1Var, wm0 wm0Var) {
        xe3 xe3Var;
        if (wm0Var instanceof xe3) {
            xe3Var = (xe3) wm0Var;
            int i = xe3Var.f34205w;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe3Var.f34205w = i - Integer.MIN_VALUE;
            } else {
                xe3Var = new xe3(this, (ym0) wm0Var);
            }
        } else {
            xe3Var = new xe3(this, (ym0) wm0Var);
        }
        Object objM7901I = xe3Var.f34203u;
        ap0 ap0Var = ap0.f14763a;
        int i2 = xe3Var.f34205w;
        wm0 wm0Var2 = null;
        if (i2 == 0) {
            k43.m7376J(objM7901I);
            g32 g32Var = new g32((byte) 15);
            g32Var.f19558b = this;
            VarHandle.storeStoreFence();
            vt0 vt0VarM10013H = qq2.m10013H(g32Var);
            fj1 fj1Var = new fj1((byte) 2);
            fj1Var.f19023b = vt0VarM10013H;
            VarHandle.storeStoreFence();
            xe3Var.f34202t = yp1Var;
            xe3Var.f34205w = 1;
            objM7901I = lb5.m7901I(fj1Var, xe3Var);
            if (objM7901I != ap0Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yp1 yp1Var2 = xe3Var.f34202t;
            k43.m7376J(objM7901I);
            return objM7901I;
        }
        yp1Var = xe3Var.f34202t;
        k43.m7376J(objM7901I);
        if (!((Boolean) objM7901I).booleanValue()) {
            lb5.m7910S(this.f35169h, null, null, new it1((Object) this.f35176o, (Object) this, wm0Var2, (byte) 18), 3);
            return null;
        }
        xe3Var.f34202t = null;
        xe3Var.f34205w = 2;
        Object objInvoke = yp1Var.invoke(xe3Var);
        return objInvoke == ap0Var ? ap0Var : objInvoke;
    }

    @Override // p000.qe3
    /* JADX INFO: renamed from: f */
    public final Boolean mo9873f() {
        return (Boolean) this.f35162a.getValue();
    }

    @Override // p000.qe3
    /* JADX INFO: renamed from: g */
    public final Object mo9874g(d00 d00Var, Activity activity, kt1 kt1Var) {
        Object objM5007w = lb5.m7937r(this.f35169h, null, new it1((Object) d00Var, (Object) activity, (wm0) null, (byte) 17), 3).m5007w(kt1Var);
        ap0 ap0Var = ap0.f14763a;
        return objM5007w;
    }

    @Override // p000.qe3
    /* JADX INFO: renamed from: h */
    public final List mo9875h() {
        return this.f35163b;
    }
}
