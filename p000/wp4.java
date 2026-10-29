package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.AbstractC0291q2;
import ads_mobile_sdk.C0033as;
import ads_mobile_sdk.C0155i0;
import ads_mobile_sdk.C0341tf;
import ads_mobile_sdk.C0398x;
import ads_mobile_sdk.dw2;
import ads_mobile_sdk.ey0;
import ads_mobile_sdk.g11;
import ads_mobile_sdk.g80;
import ads_mobile_sdk.gg3;
import ads_mobile_sdk.gt2;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.ic0;
import ads_mobile_sdk.kl2;
import ads_mobile_sdk.kn3;
import ads_mobile_sdk.m11;
import ads_mobile_sdk.og3;
import ads_mobile_sdk.pl1;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.pr2;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.q24;
import ads_mobile_sdk.qd0;
import ads_mobile_sdk.qd2;
import ads_mobile_sdk.qh3;
import ads_mobile_sdk.ql0;
import ads_mobile_sdk.qp2;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.se1;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.tg3;
import ads_mobile_sdk.uh3;
import ads_mobile_sdk.v53;
import ads_mobile_sdk.xg3;
import ads_mobile_sdk.yg2;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wp4 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f33580t;

    /* JADX INFO: renamed from: u */
    public boolean f33581u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f33582v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp4(wm0 wm0Var, od1 od1Var) {
        super(2, wm0Var);
        this.f33580t = (byte) 0;
        this.f33582v = od1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f33580t;
        Object obj2 = this.f33582v;
        switch (b) {
            case 0:
                return new wp4(wm0Var, (od1) obj2);
            case 1:
                return new wp4((mq4) obj2, wm0Var, (byte) 1);
            case 2:
                wp4 wp4Var = new wp4((Context) obj2, wm0Var, (byte) 2);
                wp4Var.f33581u = ((Boolean) obj).booleanValue();
                return wp4Var;
            case 3:
                return new wp4((ab5) obj2, wm0Var, (byte) 3);
            case 4:
                return new wp4((nu0) obj2, wm0Var, (byte) 4);
            case 5:
                return new wp4((dw2) obj2, wm0Var, (byte) 5);
            case 6:
                return new wp4((ic0) obj2, wm0Var, (byte) 6);
            case 7:
                return new wp4((gt2) obj2, wm0Var, (byte) 7);
            case 8:
                return new wp4((kl2) obj2, wm0Var, (byte) 8);
            case 9:
                return new wp4((og3) obj2, wm0Var, (byte) 9);
            case 10:
                return new wp4((v53) obj2, wm0Var, (byte) 10);
            case 11:
                return new wp4((pr2) obj2, wm0Var, (byte) 11);
            case 12:
                return new wp4((qd0) obj2, wm0Var, (byte) 12);
            case 13:
                return new wp4((g11) obj2, wm0Var, (byte) 13);
            case 14:
                return new wp4((b80) obj2, wm0Var, (byte) 14);
            case 15:
                return new wp4((ql0) obj2, wm0Var, (byte) 15);
            case 16:
                return new wp4((pl1) obj2, wm0Var, (byte) 16);
            case 17:
                return new wp4((q24) obj2, wm0Var, (byte) 17);
            case 18:
                return new wp4((AbstractC0291q2) obj2, wm0Var, (byte) 18);
            case 19:
                return new wp4((g80) obj2, wm0Var, (byte) 19);
            case 20:
                return new wp4((C0341tf) obj2, wm0Var, (byte) 20);
            case 21:
                return new wp4((yg2) obj2, wm0Var, (byte) 21);
            case 22:
                return new wp4((qp2) obj2, wm0Var, (byte) 22);
            case 23:
                return new wp4((tg3) obj2, wm0Var, (byte) 23);
            case 24:
                return new wp4((a55) obj2, wm0Var, (byte) 24);
            case 25:
                return new wp4((zi5) obj2, wm0Var, (byte) 25);
            case 26:
                return new wp4((xg3) obj2, wm0Var, (byte) 26);
            case 27:
                return new wp4((C1150sm) obj2, wm0Var, (byte) 27);
            case 28:
                return new wp4((kn3) obj2, wm0Var, (byte) 28);
            default:
                return new wp4((C0155i0) obj2, wm0Var, (byte) 29);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33580t;
        Object obj3 = this.f33582v;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((wp4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((wp4) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((wp4) create((wm0) obj2, bool)).invokeSuspend(ju4Var);
                return ju4Var;
            case 3:
                return new wp4((ab5) obj3, (wm0) obj2, (byte) 3).invokeSuspend(ju4Var);
            case 4:
                return new wp4((nu0) obj3, (wm0) obj2, (byte) 4).invokeSuspend(ju4Var);
            case 5:
                return new wp4((dw2) obj3, (wm0) obj2, (byte) 5).invokeSuspend(ju4Var);
            case 6:
                return new wp4((ic0) obj3, (wm0) obj2, (byte) 6).invokeSuspend(ju4Var);
            case 7:
                return new wp4((gt2) obj3, (wm0) obj2, (byte) 7).invokeSuspend(ju4Var);
            case 8:
                return new wp4((kl2) obj3, (wm0) obj2, (byte) 8).invokeSuspend(ju4Var);
            case 9:
                return new wp4((og3) obj3, (wm0) obj2, (byte) 9).invokeSuspend(ju4Var);
            case 10:
                return new wp4((v53) obj3, (wm0) obj2, (byte) 10).invokeSuspend(ju4Var);
            case 11:
                return new wp4((pr2) obj3, (wm0) obj2, (byte) 11).invokeSuspend(ju4Var);
            case 12:
                return new wp4((qd0) obj3, (wm0) obj2, (byte) 12).invokeSuspend(ju4Var);
            case 13:
                return new wp4((g11) obj3, (wm0) obj2, (byte) 13).invokeSuspend(ju4Var);
            case 14:
                return new wp4((b80) obj3, (wm0) obj2, (byte) 14).invokeSuspend(ju4Var);
            case 15:
                return new wp4((ql0) obj3, (wm0) obj2, (byte) 15).invokeSuspend(ju4Var);
            case 16:
                return new wp4((pl1) obj3, (wm0) obj2, (byte) 16).invokeSuspend(ju4Var);
            case 17:
                return new wp4((q24) obj3, (wm0) obj2, (byte) 17).invokeSuspend(ju4Var);
            case 18:
                return new wp4((AbstractC0291q2) obj3, (wm0) obj2, (byte) 18).invokeSuspend(ju4Var);
            case 19:
                return new wp4((g80) obj3, (wm0) obj2, (byte) 19).invokeSuspend(ju4Var);
            case 20:
                return new wp4((C0341tf) obj3, (wm0) obj2, (byte) 20).invokeSuspend(ju4Var);
            case 21:
                return new wp4((yg2) obj3, (wm0) obj2, (byte) 21).invokeSuspend(ju4Var);
            case 22:
                return new wp4((qp2) obj3, (wm0) obj2, (byte) 22).invokeSuspend(ju4Var);
            case 23:
                return new wp4((tg3) obj3, (wm0) obj2, (byte) 23).invokeSuspend(ju4Var);
            case 24:
                return new wp4((a55) obj3, (wm0) obj2, (byte) 24).invokeSuspend(ju4Var);
            case 25:
                return new wp4((zi5) obj3, (wm0) obj2, (byte) 25).invokeSuspend(ju4Var);
            case 26:
                return new wp4((xg3) obj3, (wm0) obj2, (byte) 26).invokeSuspend(ju4Var);
            case 27:
                return new wp4((C1150sm) obj3, (wm0) obj2, (byte) 27).invokeSuspend(ju4Var);
            case 28:
                return new wp4((kn3) obj3, (wm0) obj2, (byte) 28).invokeSuspend(ju4Var);
            default:
                return new wp4((C0155i0) obj3, (wm0) obj2, (byte) 29).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ju4 ju4Var;
        switch (this.f33580t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f33581u;
                if (!z) {
                    k43.m7376J(obj);
                    qe3 qe3Var = ((od1) this.f33582v).f26639d;
                    this.f33581u = true;
                    if (qe3Var.mo9869b(this) == ap0Var) {
                        return ap0Var;
                    }
                } else {
                    if (!z) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f33581u;
                if (!z2) {
                    k43.m7376J(obj);
                    mq4 mq4Var = (mq4) this.f33582v;
                    this.f33581u = true;
                    if (mq4Var.m8376h(this) == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                k43.m7376J(obj);
                boolean z3 = this.f33581u;
                Context context = (Context) this.f33582v;
                String str = x63.f34026a;
                x63.m12495a(context.getPackageManager(), new ComponentName(context, (Class<?>) RescheduleReceiver.class), z3, v63.f32430b);
                return ju4.f22634a;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f33581u;
                if (!z4) {
                    k43.m7376J(obj);
                    ab5 ab5Var = (ab5) this.f33582v;
                    up1 up1Var = new up1(tp1.f31301d, "Activity failed to start, platform generated window has no DecorView.");
                    this.f33581u = true;
                    if (ab5Var.mo177a(up1Var, this) == ap0Var4) {
                        return ap0Var4;
                    }
                } else {
                    if (!z4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f33581u;
                if (!z5) {
                    k43.m7376J(obj);
                    nu0 nu0Var = (nu0) this.f33582v;
                    this.f33581u = true;
                    if (nu0Var.invoke(this) == ap0Var5) {
                        return ap0Var5;
                    }
                } else {
                    if (!z5) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 5:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f33581u;
                if (!z6) {
                    k43.m7376J(obj);
                    dw2 dw2Var = (dw2) this.f33582v;
                    this.f33581u = true;
                    if (dw2.m709a(dw2Var, this) == ap0Var6) {
                        return ap0Var6;
                    }
                } else {
                    if (!z6) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f33581u;
                if (!z7) {
                    k43.m7376J(obj);
                    ic0 ic0Var = (ic0) this.f33582v;
                    this.f33581u = true;
                    if (ic0Var.m1276a(this) == ap0Var7) {
                        return ap0Var7;
                    }
                } else {
                    if (!z7) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 7:
                ju4 ju4Var2 = ju4.f22634a;
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f33581u;
                if (!z8) {
                    k43.m7376J(obj);
                    dw2 dw2Var2 = ((gt2) this.f33582v).f4117a;
                    this.f33581u = true;
                    Object objM715a = dw2Var2.m715a(s21.f11012D1, this);
                    if (objM715a != ap0Var8) {
                        objM715a = ju4Var2;
                    }
                    if (objM715a == ap0Var8) {
                        return ap0Var8;
                    }
                } else {
                    if (!z8) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var2;
            case 8:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z9 = this.f33581u;
                if (!z9) {
                    k43.m7376J(obj);
                    kl2 kl2Var = (kl2) this.f33582v;
                    this.f33581u = true;
                    if (kl2.m1493a(kl2Var, this) == ap0Var9) {
                        return ap0Var9;
                    }
                } else {
                    if (!z9) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 9:
                ap0 ap0Var10 = ap0.f14763a;
                boolean z10 = this.f33581u;
                if (!z10) {
                    k43.m7376J(obj);
                    si1 data = ((lt0) ((og3) this.f33582v).f8069b.get()).getData();
                    this.f33581u = true;
                    obj = lb5.m7903K(data, this);
                    if (obj == ap0Var10) {
                        return ap0Var10;
                    }
                } else {
                    if (!z10) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                gg3 gg3Var = (gg3) obj;
                return gg3Var == null ? gg3.m1048x() : gg3Var;
            case 10:
                ap0 ap0Var11 = ap0.f14763a;
                boolean z11 = this.f33581u;
                if (!z11) {
                    k43.m7376J(obj);
                    v53 v53Var = (v53) this.f33582v;
                    this.f33581u = true;
                    if (v53.m2527a(v53Var, this) == ap0Var11) {
                        return ap0Var11;
                    }
                } else {
                    if (!z11) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 11:
                ap0 ap0Var12 = ap0.f14763a;
                boolean z12 = this.f33581u;
                if (!z12) {
                    k43.m7376J(obj);
                    pr2 pr2Var = (pr2) this.f33582v;
                    this.f33581u = true;
                    if (pr2.m1973a(pr2Var, this) == ap0Var12) {
                        return ap0Var12;
                    }
                } else {
                    if (!z12) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 12:
                ju4 ju4Var3 = ju4.f22634a;
                ap0 ap0Var13 = ap0.f14763a;
                boolean z13 = this.f33581u;
                if (!z13) {
                    k43.m7376J(obj);
                    qd0 qd0Var = (qd0) this.f33582v;
                    this.f33581u = true;
                    qd0.m2031a(qd0Var, this);
                    if (ju4Var3 == ap0Var13) {
                        return ap0Var13;
                    }
                } else {
                    if (!z13) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var3;
            case 13:
                ju4 ju4Var4 = ju4.f22634a;
                ap0 ap0Var14 = ap0.f14763a;
                boolean z14 = this.f33581u;
                if (!z14) {
                    k43.m7376J(obj);
                    g11 g11Var = (g11) this.f33582v;
                    this.f33581u = true;
                    Object objMo1510b = g11Var.f3765a.mo1510b(this);
                    if (objMo1510b != ap0Var14) {
                        objMo1510b = ju4Var4;
                    }
                    if (objMo1510b == ap0Var14) {
                        return ap0Var14;
                    }
                } else {
                    if (!z14) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var4;
            case 14:
                ju4 ju4Var5 = ju4.f22634a;
                ap0 ap0Var15 = ap0.f14763a;
                boolean z15 = this.f33581u;
                if (!z15) {
                    k43.m7376J(obj);
                    b80 b80Var = (b80) this.f33582v;
                    this.f33581u = true;
                    if (b80Var.mo5484c(this, ju4Var5) == ap0Var15) {
                        return ap0Var15;
                    }
                } else {
                    if (!z15) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var5;
            case 15:
                ap0 ap0Var16 = ap0.f14763a;
                boolean z16 = this.f33581u;
                if (!z16) {
                    k43.m7376J(obj);
                    ql0 ql0Var = (ql0) this.f33582v;
                    this.f33581u = true;
                    if (ql0.m2052a(ql0Var, this) == ap0Var16) {
                        return ap0Var16;
                    }
                } else {
                    if (!z16) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 16:
                ap0 ap0Var17 = ap0.f14763a;
                boolean z17 = this.f33581u;
                if (!z17) {
                    k43.m7376J(obj);
                    qd2 qd2Var = ((pl1) this.f33582v).f8667f;
                    this.f33581u = true;
                    qd2Var.getClass();
                    obj = qd2.m2034b(qd2Var, this);
                    if (obj == ap0Var17) {
                        return ap0Var17;
                    }
                } else {
                    if (!z17) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                mi5 mi5Var = (mi5) obj;
                if (mi5Var instanceof i11) {
                    return (i11) mi5Var;
                }
                qh3 qh3Var = ((uh3) ((q11) mi5Var).f8791b).f12397b;
                return qh3Var.f9009d == null ? new m11("Raw JSON for cache is missing", pm1.f8670a) : new q11(qh3Var);
            case 17:
                ap0 ap0Var18 = ap0.f14763a;
                boolean z18 = this.f33581u;
                if (z18) {
                    if (z18) {
                        k43.m7376J(obj);
                        return ju4.f22634a;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                q24 q24Var = (q24) this.f33582v;
                this.f33581u = true;
                q24Var.m2019v(this);
                return ap0Var18;
            case 18:
                ap0 ap0Var19 = ap0.f14763a;
                boolean z19 = this.f33581u;
                if (z19) {
                    if (z19) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                AbstractC0291q2 abstractC0291q2 = (AbstractC0291q2) this.f33582v;
                this.f33581u = true;
                Object objMo473a = abstractC0291q2.mo473a(false, (wm0) this);
                return objMo473a == ap0Var19 ? ap0Var19 : objMo473a;
            case 19:
                ap0 ap0Var20 = ap0.f14763a;
                boolean z20 = this.f33581u;
                if (!z20) {
                    k43.m7376J(obj);
                    g80 g80Var = (g80) this.f33582v;
                    AtomicReference atomicReference = g80Var.f3857l;
                    v82 v82Var = g80Var.f3859n;
                    this.f33581u = true;
                    if (g80Var.m1031a(atomicReference, v82Var, (Long) null, this) == ap0Var20) {
                        return ap0Var20;
                    }
                } else {
                    if (!z20) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 20:
                ap0 ap0Var21 = ap0.f14763a;
                boolean z21 = this.f33581u;
                if (!z21) {
                    k43.m7376J(obj);
                    C0341tf c0341tf = (C0341tf) this.f33582v;
                    this.f33581u = true;
                    if (C0341tf.m2326a(c0341tf, (C0751i6) null, this) == ap0Var21) {
                        return ap0Var21;
                    }
                } else {
                    if (!z21) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 21:
                ap0 ap0Var22 = ap0.f14763a;
                boolean z22 = this.f33581u;
                if (!z22) {
                    k43.m7376J(obj);
                    s41 s41Var = ((yg2) this.f33582v).f13725f.f4806a;
                    this.f33581u = true;
                    if (s41Var.m2211a(this) == ap0Var22) {
                        return ap0Var22;
                    }
                } else {
                    if (!z22) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 22:
                ap0 ap0Var23 = ap0.f14763a;
                boolean z23 = this.f33581u;
                if (z23) {
                    if (z23) {
                        k43.m7376J(obj);
                        return ju4.f22634a;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                qp2 qp2Var = (qp2) this.f33582v;
                this.f33581u = true;
                qp2.m2058a(qp2Var, this);
                return ap0Var23;
            case 23:
                ap0 ap0Var24 = ap0.f14763a;
                boolean z24 = this.f33581u;
                if (!z24) {
                    k43.m7376J(obj);
                    vi5 vi5Var = ((tg3) this.f33582v).f11962e;
                    this.f33581u = true;
                    if (vi5Var.mo647c(this) == ap0Var24) {
                        return ap0Var24;
                    }
                } else {
                    if (!z24) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 24:
                ap0 ap0Var25 = ap0.f14763a;
                boolean z25 = this.f33581u;
                if (z25) {
                    if (z25) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                a55 a55Var = (a55) this.f33582v;
                this.f33581u = true;
                Object objM94a = a55.m94a(a55Var, this);
                return objM94a == ap0Var25 ? ap0Var25 : objM94a;
            case 25:
                ap0 ap0Var26 = ap0.f14763a;
                boolean z26 = this.f33581u;
                if (!z26) {
                    k43.m7376J(obj);
                    zi5 zi5Var = (zi5) this.f33582v;
                    this.f33581u = true;
                    obj = ((se1) zi5Var.f11924a.get()).m2240t(this);
                    if (obj == ap0Var26) {
                        return ap0Var26;
                    }
                } else {
                    if (!z26) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 26:
                ap0 ap0Var27 = ap0.f14763a;
                boolean z27 = this.f33581u;
                if (!z27) {
                    k43.m7376J(obj);
                    vi5 vi5Var2 = ((xg3) this.f33582v).f13296e;
                    this.f33581u = true;
                    if (vi5Var2.mo647c(this) == ap0Var27) {
                        return ap0Var27;
                    }
                } else {
                    if (!z27) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 27:
                ap0 ap0Var28 = ap0.f14763a;
                boolean z28 = this.f33581u;
                if (!z28) {
                    k43.m7376J(obj);
                    C1150sm c1150sm = (C1150sm) this.f33582v;
                    this.f33581u = true;
                    if (c1150sm.invoke(this) == ap0Var28) {
                        return ap0Var28;
                    }
                } else {
                    if (!z28) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 28:
                ap0 ap0Var29 = ap0.f14763a;
                boolean z29 = this.f33581u;
                if (z29) {
                    if (z29) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ra5 ra5VarMo652b = ((kn3) this.f33582v).mo652b();
                this.f33581u = true;
                Object objMo524b = ra5VarMo652b.mo524b(this);
                return objMo524b == ap0Var29 ? ap0Var29 : objMo524b;
            default:
                ap0 ap0Var30 = ap0.f14763a;
                boolean z30 = this.f33581u;
                if (!z30) {
                    k43.m7376J(obj);
                    ey0 ey0Var = ((C0155i0) this.f33582v).f4706f;
                    ey0Var.getClass();
                    r50 r50Var = i41.f21117b;
                    long j = ((i41) ey0Var.m13553a("gads:app_activity_tracker:notify_background_listeners_delay_ms", zy5.m13887v(500, m41.MILLISECONDS), C0033as.a$6)).f21121a;
                    this.f33581u = true;
                    if (d24.m4318s(j, this) == ap0Var30) {
                        return ap0Var30;
                    }
                } else {
                    if (!z30) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                C0155i0 c0155i0 = (C0155i0) this.f33582v;
                synchronized (c0155i0) {
                    try {
                        if (c0155i0.f4712l && !c0155i0.m1248i()) {
                            wm0 wm0Var = null;
                            AbstractC0137h.m1112b("App is now backgrounded", null);
                            c0155i0.f4715o = true;
                            r50 r50Var2 = i41.f21117b;
                            c0155i0.f4707g.getClass();
                            long jM3239R = as4.m3239R(SystemClock.elapsedRealtime(), m41.MILLISECONDS);
                            Iterator it = c0155i0.f4708h.iterator();
                            while (it.hasNext()) {
                                sy3.m2303a(c0155i0.f4705e, (t82) null, new C0398x((fe5) it.next(), jM3239R, wm0Var, (byte) 1), 3);
                            }
                        }
                        ju4Var = ju4.f22634a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp4(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f33580t = b;
        this.f33582v = obj;
    }
}
