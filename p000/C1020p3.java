package p000;

import ads_mobile_sdk.C0080d4;
import ads_mobile_sdk.b40;
import ads_mobile_sdk.j10;
import android.content.SharedPreferences;
import java.io.File;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: p3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1020p3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f27332t;

    /* JADX INFO: renamed from: u */
    public boolean f27333u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f27334v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1020p3(Object obj, wm0 wm0Var, byte b) {
        super(1, wm0Var);
        this.f27332t = b;
        this.f27334v = obj;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f27332t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f27334v;
        switch (b) {
            case 0:
                return new C1020p3((he0) obj2, (wm0) obj, (byte) 0).invokeSuspend(ju4Var);
            case 1:
                return new C1020p3((C1409zl) obj2, (wm0) obj, (byte) 1).invokeSuspend(ju4Var);
            case 2:
                return new C1020p3((e54) obj2, (wm0) obj, (byte) 2).invokeSuspend(ju4Var);
            case 3:
                return new C1020p3((ju0) obj2, (wm0) obj, (byte) 3).invokeSuspend(ju4Var);
            case 4:
                return new C1020p3((wh1) obj2, (wm0) obj, (byte) 4).invokeSuspend(ju4Var);
            case 5:
                return new C1020p3((C0891m) obj2, (wm0) obj, (byte) 5).invokeSuspend(ju4Var);
            case 6:
                return new C1020p3((co4) obj2, (wm0) obj, (byte) 6).invokeSuspend(ju4Var);
            case 7:
                return new C1020p3((C0080d4) obj2, (wm0) obj, (byte) 7).invokeSuspend(ju4Var);
            case 8:
                return new C1020p3((ix0) obj2, (wm0) obj, (byte) 8).invokeSuspend(ju4Var);
            default:
                return new C1020p3((j10) obj2, (wm0) obj, (byte) 9).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.f27332t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f27334v;
        wm0 wm0Var = null;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f27333u;
                if (z) {
                    if (z) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C0932n3 c0932n3 = new C0932n3((byte) 0);
                c0932n3.f25415b = (he0) obj2;
                VarHandle.storeStoreFence();
                vt0 vt0VarM10013H = qq2.m10013H(c0932n3);
                C0969o3 c0969o3 = new C0969o3(2, wm0Var, (byte) 0);
                this.f27333u = true;
                return lb5.m7902J(vt0VarM10013H, c0969o3, this) == ap0Var ? ap0Var : ju4Var;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f27333u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C1409zl c1409zl = (C1409zl) obj2;
                this.f27333u = true;
                File fileM11046Q0 = tf1.m11046Q0(c1409zl.f36165b, "files/backups");
                File file = c1409zl.f36165b;
                List listM7694Y = kx5.m7694Y(tf1.m11046Q0(file, "databases"), tf1.m11046Q0(file, "datastore"));
                List listM7694Y2 = kx5.m7694Y(new File("com.google.android.datatransport.events"), new File("com.google.android.datatransport.events-journal"));
                C0924mw c0924mw = new C0924mw();
                c0924mw.f25248a = fileM11046Q0;
                c0924mw.f25249b = listM7694Y;
                c0924mw.f25250c = listM7694Y2;
                VarHandle.storeStoreFence();
                return c0924mw == ap0Var2 ? ap0Var2 : c0924mw;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f27333u;
                if (!z3) {
                    k43.m7376J(obj);
                    e54 e54Var = (e54) obj2;
                    this.f27333u = true;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) e54Var.f17714e.getValue()).edit();
                    Set set = e54Var.f17715f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (editorEdit.commit()) {
                        if (((SharedPreferences) e54Var.f17714e.getValue()).getAll().isEmpty()) {
                            e54Var.f17712c.deleteSharedPreferences(e54Var.f17713d);
                        }
                        if (set != null) {
                            set.clear();
                        }
                        return ju4Var == ap0Var3 ? ap0Var3 : ju4Var;
                    }
                    wb1.m12191j("Unable to delete migrated keys from SharedPreferences.");
                } else {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f27333u;
                if (!z4) {
                    k43.m7376J(obj);
                    this.f27333u = true;
                    Object objInvoke = ((ju0) obj2).invoke(this);
                    return objInvoke == ap0Var4 ? ap0Var4 : objInvoke;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f27333u;
                if (z5) {
                    if (z5) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                wh1 wh1Var = (wh1) obj2;
                this.f27333u = true;
                if (((Boolean) wh1Var.f33382d.getValue()).booleanValue()) {
                    wh1Var.f33380b.setTorchMode(wh1Var.f33381c, !((Boolean) wh1Var.f33383e.getValue()).booleanValue());
                }
                return ju4Var == ap0Var5 ? ap0Var5 : ju4Var;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f27333u;
                if (!z6) {
                    k43.m7376J(obj);
                    this.f27333u = true;
                    Object objMo9530l = C0006a5.m84v(getContext()).mo9530l((C0891m) obj2, this);
                    return objMo9530l == ap0Var6 ? ap0Var6 : objMo9530l;
                }
                if (z6) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f27333u;
                if (z7) {
                    if (z7) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                co4 co4Var = (co4) obj2;
                this.f27333u = true;
                b70 b70Var = new b70(1, C0006a5.m86x(this));
                b70Var.m3497u();
                co4Var.f16185b.f31487g.setValue(Boolean.TRUE);
                co4Var.f16186c = b70Var;
                return b70Var.m3495r() == ap0Var7 ? ap0Var7 : ju4Var;
            case 7:
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f27333u;
                if (z8) {
                    if (z8) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                b40 b40Var = ((C0080d4) obj2).f2372l;
                this.f27333u = true;
                Object objM434C = b40Var.m434C(this);
                return objM434C == ap0Var8 ? ap0Var8 : objM434C;
            case 8:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z9 = this.f27333u;
                if (!z9) {
                    k43.m7376J(obj);
                    this.f27333u = true;
                    Object objM5007w = ((ix0) obj2).m5007w(this);
                    return objM5007w == ap0Var9 ? ap0Var9 : objM5007w;
                }
                if (z9) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                ap0 ap0Var10 = ap0.f14763a;
                boolean z10 = this.f27333u;
                if (z10) {
                    if (z10) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                j10 j10Var = (j10) obj2;
                this.f27333u = true;
                Object objM7921b0 = lb5.m7921b0(j10Var.f5492c, new vs0(j10Var, true, (String) null, (wm0) null), this);
                return objM7921b0 == ap0Var10 ? ap0Var10 : objM7921b0;
        }
    }
}
