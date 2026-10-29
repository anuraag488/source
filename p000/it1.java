package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.VibrationEffect;
import android.util.Log;
import android.view.textclassifier.TextClassifier;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class it1 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f21764t;

    /* JADX INFO: renamed from: u */
    public boolean f21765u;

    /* JADX INFO: renamed from: v */
    public Object f21766v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f21767w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it1(k84 k84Var, C1031pe c1031pe, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21764t = (byte) 28;
        xw2 xw2Var = xw2.f34665a;
        this.f21766v = k84Var;
        this.f21767w = c1031pe;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f21764t;
        Object obj2 = this.f21767w;
        switch (b) {
            case 0:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 0);
            case 1:
                return new it1(wm0Var, this.f21766v, (iq1) obj2, (byte) 1);
            case 2:
                it1 it1Var = new it1(obj2, wm0Var, (byte) 2);
                it1Var.f21766v = obj;
                return it1Var;
            case 3:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 3);
            case 4:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 4);
            case 5:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 5);
            case 6:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 6);
            case 7:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 7);
            case 8:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 8);
            case 9:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 9);
            case 10:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 10);
            case 11:
                return new it1(wm0Var, this.f21766v, (iq1) obj2, (byte) 11);
            case 12:
                return new it1(wm0Var, this.f21766v, (iq1) obj2, (byte) 12);
            case 13:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 13);
            case 14:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 14);
            case 15:
                it1 it1Var2 = new it1(obj2, wm0Var, (byte) 15);
                it1Var2.f21766v = obj;
                return it1Var2;
            case 16:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 16);
            case 17:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 17);
            case 18:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 18);
            case 19:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 19);
            case 20:
                return new it1(this.f21765u, (rn3) this.f21766v, obj2, wm0Var);
            case 21:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 21);
            case 22:
                it1 it1Var3 = new it1(obj2, wm0Var, (byte) 22);
                it1Var3.f21766v = obj;
                return it1Var3;
            case 23:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 23);
            case 24:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 24);
            case 25:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 25);
            case 26:
                return new it1(obj2, wm0Var, (byte) 26);
            case 27:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 27);
            case 28:
                k84 k84Var = (k84) this.f21766v;
                xw2 xw2Var = xw2.f34665a;
                return new it1(k84Var, (C1031pe) obj2, wm0Var);
            default:
                return new it1(this.f21766v, obj2, wm0Var, (byte) 29);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.f21764t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((it1) create((wm0) obj2, (Intent) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 7:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 9:
                ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 10:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 16:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 17:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 18:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 19:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 20:
                ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
                return ju4Var;
            case 21:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 22:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 23:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 24:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 25:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 26:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 27:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 28:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((it1) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r1v112 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [t82] */
    /* JADX WARN: Type inference failed for: r1v57, types: [t82] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objMo8106a;
        Object objM7903K;
        Object objM4387d;
        Object objMo3509d;
        Object objM7968b;
        Object objM7901I;
        e44 e44Var;
        byte b = this.f21764t;
        int i = 2;
        byte b2 = 5;
        byte b3 = 0;
        Object obj2 = ju4.f22634a;
        Object obj3 = this.f21767w;
        ?? r13 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z6 = this.f21765u;
                if (z6) {
                    if (z6) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                lv1 lv1Var = (lv1) this.f21766v;
                if (lv1Var != null) {
                    VibrationEffect vibrationEffectCreateWaveform = VibrationEffect.createWaveform(new long[]{200}, new int[]{150}, -1);
                    nc4 nc4Var = nv1.f26110a;
                    lv1Var.m8115a(new dv1(null, vibrationEffectCreateWaveform));
                }
                Float f = new Float(1.0f);
                db4 db4VarM10014I = qq2.m10014I(0.0f, 0.0f, null, 7);
                this.f21765u = true;
                return C0910mi.m8325a((C0910mi) obj3, f, db4VarM10014I, null, this, 12) == ap0Var ? ap0Var : obj2;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z7 = this.f21765u;
                if (z7) {
                    if (z7) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                mq1 mq1Var = (mq1) this.f21766v;
                Object objInvoke = ((wp1) obj3).invoke();
                this.f21765u = true;
                return mq1Var.invoke(objInvoke, this) == ap0Var2 ? ap0Var2 : obj2;
            case 2:
                Intent intent = (Intent) this.f21766v;
                ap0 ap0Var3 = ap0.f14763a;
                boolean z8 = this.f21765u;
                if (z8) {
                    if (z8) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                C0928n c0928n = new C0928n((byte) 10);
                c0928n.f25353b = intent;
                VarHandle.storeStoreFence();
                pg0 pg0Var = new pg0(-193839389, true, c0928n);
                this.f21766v = null;
                this.f21765u = true;
                Object objM12799b = ((xz4) obj3).m12799b(pg0Var, this);
                return objM12799b == ap0Var3 ? ap0Var3 : objM12799b;
            case 3:
                e82 e82Var = (e82) this.f21766v;
                ThreadLocal threadLocal = e82Var.f17879b;
                ap0 ap0Var4 = ap0.f14763a;
                boolean z9 = this.f21765u;
                try {
                    if (!z9) {
                        k43.m7376J(obj);
                        Object obj4 = threadLocal.get();
                        Boolean bool = Boolean.TRUE;
                        if (z62.m13387o(obj4, bool)) {
                            C1077qn.m9989o("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                            return null;
                        }
                        threadLocal.set(bool);
                        lt0 lt0Var = e82Var.f17880c;
                        qs0 qs0Var = new qs0((yp1) obj3, null);
                        this.f21765u = true;
                        objMo8106a = lt0Var.mo8106a(new er2((Object) qs0Var, (wm0) (z ? 1 : 0), b2), this);
                        if (objMo8106a == ap0Var4) {
                            return ap0Var4;
                        }
                    } else {
                        if (!z9) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                        objMo8106a = obj;
                    }
                    hw2 hw2Var = (hw2) objMo8106a;
                    threadLocal.set(Boolean.FALSE);
                    return hw2Var;
                } catch (Throwable th) {
                    threadLocal.set(Boolean.FALSE);
                    throw th;
                }
            case 4:
                Object objM6525c = ap0.f14763a;
                boolean z10 = this.f21765u;
                if (!z10) {
                    k43.m7376J(obj);
                    si1 data = ((e82) this.f21766v).f17880c.getData();
                    this.f21765u = true;
                    objM7903K = lb5.m7903K(data, this);
                    if (objM7903K != objM6525c) {
                    }
                    return objM6525c;
                }
                if (!z10) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                objM7903K = obj;
                hw2 hw2Var2 = (hw2) objM7903K;
                if (hw2Var2 == null || (objM6525c = hw2Var2.m6525c((xd3) obj3)) == null) {
                    return null;
                }
                return objM6525c;
            case 5:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z11 = this.f21765u;
                if (z11) {
                    if (z11) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                js1 js1Var = (js1) this.f21766v;
                this.f21765u = true;
                b70 b70Var = new b70(1, C0006a5.m86x(this));
                b70Var.m3497u();
                yc2 yc2Var = new yc2();
                yc2Var.f35117e = js1Var;
                yc2Var.f35113a = b70Var;
                VarHandle.storeStoreFence();
                js1Var.f22555a = yc2Var;
                new ut3(C0006a5.m86x(C0006a5.m74l(yc2Var, yc2Var, (C1215ud) obj3))).resumeWith(obj2);
                C0686gf c0686gf = new C0686gf((byte) 9);
                c0686gf.f19762b = js1Var;
                c0686gf.f19763c = yc2Var;
                VarHandle.storeStoreFence();
                b70Var.m3499w(c0686gf);
                return b70Var.m3495r() == ap0Var5 ? ap0Var5 : obj2;
            case 6:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z12 = this.f21765u;
                if (!z12) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    xb3.m12646a((ej2) this.f21766v, (C1031pe) obj3, this);
                    return ap0Var6;
                }
                if (!z12) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                xy4.m12794w();
                return null;
            case 7:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z13 = this.f21765u;
                if (!z13) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    return ((fr2) this.f21766v).f19235a.m6488i((Uri) obj3, this) == ap0Var7 ? ap0Var7 : obj2;
                }
                if (z13) {
                    k43.m7376J(obj);
                    return obj2;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 8:
                ap0 ap0Var8 = ap0.f14763a;
                boolean z14 = this.f21765u;
                if (!z14) {
                    k43.m7376J(obj);
                    yb4 yb4Var = (yb4) this.f21766v;
                    C0906me c0906me = new C0906me(b2);
                    c0906me.f24836b = (eu2) obj3;
                    VarHandle.storeStoreFence();
                    this.f21765u = true;
                    if (yb4Var.collect(c0906me, this) == ap0Var8) {
                        return ap0Var8;
                    }
                } else {
                    if (!z14) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                xy4.m12794w();
                return null;
            case 9:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z15 = this.f21765u;
                if (!z15) {
                    k43.m7376J(obj);
                    qw2 qw2Var = (qw2) this.f21766v;
                    C0982og c0982og = new C0982og(obj3, (wm0) (z2 ? 1 : 0), (byte) 16);
                    this.f21765u = true;
                    if (sj3.m10820p(qw2Var, c0982og, this) == ap0Var9) {
                        return ap0Var9;
                    }
                } else {
                    if (!z15) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                C1077qn.m9989o("SharedFlow never completes, this call should never return.");
                return null;
            case 10:
                xz2 xz2Var = (xz2) this.f21766v;
                ap0 ap0Var10 = ap0.f14763a;
                boolean z16 = this.f21765u;
                if (!z16) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    d64 d64Var = xz2Var.f34740e;
                    if (d64Var == null || (objM4387d = d64Var.m4387d(this)) != ap0Var10) {
                        objM4387d = obj2;
                    }
                    if (objM4387d == ap0Var10) {
                        return ap0Var10;
                    }
                } else {
                    if (!z16) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                ((w94) obj3).remove(xz2Var);
                return obj2;
            case 11:
                ap0 ap0Var11 = ap0.f14763a;
                boolean z17 = this.f21765u;
                if (z17) {
                    if (z17) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                lv1 lv1Var2 = (lv1) this.f21766v;
                if (lv1Var2 != null) {
                    lv1Var2.m8115a(new dv1(d55.m4371p(0.7f, 1, 0), nv1.m8856a()));
                }
                this.f21765u = true;
                return ((yp1) obj3).invoke(this) == ap0Var11 ? ap0Var11 : obj2;
            case 12:
                ap0 ap0Var12 = ap0.f14763a;
                boolean z18 = this.f21765u;
                if (z18) {
                    if (z18) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                pz2 pz2Var = (pz2) this.f21766v;
                qz2 qz2Var = new qz2(b3);
                qz2Var.f28901b = (pg0) obj3;
                VarHandle.storeStoreFence();
                pg0 pg0Var2 = new pg0(1607265659, true, qz2Var);
                this.f21765u = true;
                ic2[] ic2VarArr = rz2.f29744a;
                ic2[] ic2VarArr2 = zz2.f36502a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(Collections.singletonMap("sheet", obj2));
                linkedHashMap.putAll(w71.f33134a);
                return pz2Var.m9691c(new kr3(linkedHashMap, pg0Var2), this) == ap0Var12 ? ap0Var12 : obj2;
            case 13:
                ap0 ap0Var13 = ap0.f14763a;
                boolean z19 = this.f21765u;
                if (!z19) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    if (d24.m4317r(1000L, this) == ap0Var13) {
                        return ap0Var13;
                    }
                } else {
                    if (!z19) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((mg3) obj3).mo5493n(new pl0(7));
                return obj2;
            case 14:
                ap0 ap0Var14 = ap0.f14763a;
                boolean z20 = this.f21765u;
                if (!z20) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    return ((o13) this.f21766v).f26284a.m12034g(xw2.f34666b, (mq1) obj3, this) == ap0Var14 ? ap0Var14 : obj2;
                }
                if (z20) {
                    k43.m7376J(obj);
                    return obj2;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 15:
                ap0 ap0Var15 = ap0.f14763a;
                ?? r1 = this.f21765u;
                try {
                    if (r1 == 0) {
                        k43.m7376J(obj);
                        t82 t82VarM7910S = lb5.m7910S((zo0) this.f21766v, null, null, new C0982og(i, (wm0) (z3 ? 1 : 0)), 3);
                        this.f21766v = t82VarM7910S;
                        this.f21765u = true;
                        objMo3509d = ((b80) obj3).mo3509d(this);
                        r1 = t82VarM7910S;
                        if (objMo3509d == ap0Var15) {
                            return ap0Var15;
                        }
                    } else {
                        if (r1 != 1) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t82 t82Var = (t82) this.f21766v;
                        k43.m7376J(obj);
                        objMo3509d = obj;
                        r1 = t82Var;
                    }
                    r1.mo4993a(null);
                    r13 = objMo3509d;
                    return r13;
                } catch (Throwable th2) {
                    r1.mo4993a(r13);
                    throw th2;
                }
            case 16:
                ap0 ap0Var16 = ap0.f14763a;
                boolean z21 = this.f21765u;
                if (z21) {
                    if (z21) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                TextClassifier textClassifier = (TextClassifier) this.f21766v;
                if (textClassifier == null) {
                    return null;
                }
                this.f21765u = true;
                Object objInvoke2 = ((mq1) obj3).invoke(textClassifier, this);
                return objInvoke2 == ap0Var16 ? ap0Var16 : objInvoke2;
            case 17:
                ap0 ap0Var17 = ap0.f14763a;
                boolean z22 = this.f21765u;
                if (z22) {
                    if (z22) {
                        k43.m7376J(obj);
                        return obj;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                d00 d00Var = (d00) this.f21766v;
                this.f21765u = true;
                Object objM5007w = lb5.m7937r(d00Var.f16659c, null, new C0980oe(d00Var, d00Var.f16660d, d00Var.f16661e, d00Var.f16662f, (Activity) obj3, null, (byte) 3), 3).m5007w(this);
                return objM5007w == ap0Var17 ? ap0Var17 : objM5007w;
            case 18:
                ap0 ap0Var18 = ap0.f14763a;
                boolean z23 = this.f21765u;
                if (!z23) {
                    k43.m7376J(obj);
                    ((yp1) this.f21766v).invoke("This functionality is only available in the premium version!");
                    this.f21765u = true;
                    return ((ye3) obj3).mo9869b(this) == ap0Var18 ? ap0Var18 : obj2;
                }
                if (z23) {
                    k43.m7376J(obj);
                    return obj2;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 19:
                ap0 ap0Var19 = ap0.f14763a;
                boolean z24 = this.f21765u;
                if (!z24) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    Object objM7997a = ((lk3) this.f21766v).m7997a((b12) obj3, 1, this);
                    return objM7997a == ap0Var19 ? ap0Var19 : objM7997a;
                }
                if (z24) {
                    k43.m7376J(obj);
                    return obj;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 20:
                ap0 ap0Var20 = ap0.f14763a;
                k43.m7376J(obj);
                boolean z25 = this.f21765u;
                HashSet hashSet = ((rn3) this.f21766v).f29457r;
                if (z25) {
                    hashSet.add(obj3);
                } else {
                    hashSet.remove(obj3);
                }
                return obj2;
            case 21:
                ap0 ap0Var21 = ap0.f14763a;
                boolean z26 = this.f21765u;
                if (!z26) {
                    k43.m7376J(obj);
                    this.f21765u = true;
                    return C0910mi.m8325a(((C1366yf) this.f21766v).f35183u, new Float(0.0f), (InterfaceC1407zj) obj3, null, this, 12) == ap0Var21 ? ap0Var21 : obj2;
                }
                if (z26) {
                    k43.m7376J(obj);
                    return obj2;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 22:
                zo0 zo0Var = (zo0) this.f21766v;
                ap0 ap0Var22 = ap0.f14763a;
                boolean z27 = this.f21765u;
                if (z27) {
                    if (z27) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                ArrayList arrayList = new ArrayList();
                ql3 ql3Var = new ql3();
                ml3 ml3Var = new ml3();
                C1366yf c1366yf = (C1366yf) obj3;
                y44 y44Var = c1366yf.f35177o.f26111a;
                zp3 zp3Var = new zp3();
                zp3Var.f36247a = ml3Var;
                zp3Var.f36248b = c1366yf;
                zp3Var.f36249c = arrayList;
                zp3Var.f36250d = ql3Var;
                zp3Var.f36251e = zo0Var;
                VarHandle.storeStoreFence();
                this.f21766v = null;
                this.f21765u = true;
                y44Var.getClass();
                y44.m12879k(y44Var, zp3Var, this);
                return ap0Var22;
            case 23:
                ap0 ap0Var23 = ap0.f14763a;
                boolean z28 = this.f21765u;
                if (z28) {
                    if (z28) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                g21 g21Var = (g21) this.f21766v;
                float f2 = g21Var.f19500b ? -1.0f : 1.0f;
                vy3 vy3Var = ((iy3) obj3).f21891R;
                long jM7336g = jx4.m7336g(g21Var.f19499a, f2);
                this.f21765u = true;
                return vy3Var.m12030c(jM7336g, false, this) == ap0Var23 ? ap0Var23 : obj2;
            case 24:
                ap0 ap0Var24 = ap0.f14763a;
                boolean z29 = this.f21765u;
                try {
                    if (!z29) {
                        k43.m7376J(obj);
                        lt0 lt0Var2 = ((a34) this.f21766v).f80b;
                        C1260vl c1260vl = new C1260vl(obj3, (wm0) (z5 ? 1 : 0), (byte) 14);
                        this.f21765u = true;
                        if (lt0Var2.mo8106a(new er2((Object) c1260vl, (wm0) (z4 ? 1 : 0), b2), this) == ap0Var24) {
                            obj2 = ap0Var24;
                        }
                    } else {
                        if (!z29) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    return obj2;
                } catch (IOException e) {
                    Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e);
                    return obj2;
                }
            case 25:
                ArrayList arrayList2 = (ArrayList) obj3;
                tt2 tt2Var = (tt2) this.f21766v;
                ap0 ap0Var25 = ap0.f14763a;
                boolean z30 = this.f21765u;
                if (!z30) {
                    k43.m7376J(obj);
                    lh1 lh1Var = lh1.f24030a;
                    this.f21765u = true;
                    objM7968b = lh1Var.m7968b(this);
                    if (objM7968b == ap0Var25) {
                        return ap0Var25;
                    }
                } else {
                    if (!z30) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                    objM7968b = obj;
                }
                Map map = (Map) objM7968b;
                if (map.isEmpty()) {
                    Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
                    return obj2;
                }
                Collection collectionValues = map.values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((kp0) it.next()).f23307a.m3668a()) {
                            for (Message message : hb0.m6315a1(hb0.m6297I0(kx5.m7699b0(tt2.m11141s(arrayList2, 2), tt2.m11141s(arrayList2, 1))), new vl1((byte) 21))) {
                                if (((Messenger) tt2Var.f31429c) != null) {
                                    try {
                                        Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
                                        Messenger messenger = (Messenger) tt2Var.f31429c;
                                        if (messenger != null) {
                                            messenger.send(message);
                                        }
                                    } catch (RemoteException e2) {
                                        Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
                                        tt2Var.m11158z(message);
                                    }
                                } else {
                                    tt2Var.m11158z(message);
                                }
                            }
                            return obj2;
                        }
                    }
                }
                Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                return obj2;
            case 26:
                ap0 ap0Var26 = ap0.f14763a;
                boolean z31 = this.f21765u;
                if (!z31) {
                    k43.m7376J(obj);
                    e44 e44Var2 = (e44) obj3;
                    si1 data2 = e44Var2.f17688a.getData();
                    this.f21766v = e44Var2;
                    this.f21765u = true;
                    objM7901I = lb5.m7901I(data2, this);
                    if (objM7901I == ap0Var26) {
                        return ap0Var26;
                    }
                    e44Var = e44Var2;
                } else {
                    if (!z31) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e44Var = (e44) this.f21766v;
                    k43.m7376J(obj);
                    objM7901I = obj;
                }
                e44Var.m4919c(new hw2(new LinkedHashMap(((hw2) objM7901I).m6523a()), true));
                return obj2;
            case 27:
                sw2 sw2Var = (sw2) obj3;
                ap0 ap0Var27 = ap0.f14763a;
                boolean z32 = this.f21765u;
                try {
                    if (!z32) {
                        k43.m7376J(obj);
                        d64 d64Var2 = (d64) this.f21766v;
                        this.f21765u = true;
                        if (d64Var2.m4390g(this) == ap0Var27) {
                            return ap0Var27;
                        }
                    } else {
                        if (!z32) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    nc4 nc4Var2 = a64.f143a;
                    sw2Var.setValue(Boolean.TRUE);
                    return obj2;
                } catch (Throwable th3) {
                    nc4 nc4Var3 = a64.f143a;
                    sw2Var.setValue(Boolean.TRUE);
                    throw th3;
                }
            case 28:
                k84 k84Var = (k84) this.f21766v;
                ap0 ap0Var28 = ap0.f14763a;
                boolean z33 = this.f21765u;
                try {
                    if (!z33) {
                        k43.m7376J(obj);
                        k84Var.m7427d(true);
                        dx2 dx2Var = k84Var.f23001p;
                        vv0 vv0Var = k84Var.f23000o;
                        this.f21765u = true;
                        dx2Var.getClass();
                        if (zp0.m13685q(new cx2(xw2.f34666b, dx2Var, (C1031pe) obj3, vv0Var, null), this) == ap0Var28) {
                            return ap0Var28;
                        }
                    } else {
                        if (!z33) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    k84Var.m7427d(false);
                    return obj2;
                } catch (Throwable th4) {
                    k84Var.m7427d(false);
                    throw th4;
                }
            default:
                ap0 ap0Var29 = ap0.f14763a;
                boolean z34 = this.f21765u;
                if (z34) {
                    if (z34) {
                        k43.m7376J(obj);
                        return obj2;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                si1 si1Var = (si1) this.f21766v;
                u94 u94Var = new u94((byte) 1);
                u94Var.f31740b = (lg3) obj3;
                VarHandle.storeStoreFence();
                this.f21765u = true;
                return si1Var.collect(u94Var, this) == ap0Var29 ? ap0Var29 : obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it1(wm0 wm0Var, Object obj, iq1 iq1Var, byte b) {
        super(2, wm0Var);
        this.f21764t = b;
        this.f21766v = obj;
        this.f21767w = iq1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it1(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21764t = b;
        this.f21767w = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it1(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f21764t = b;
        this.f21766v = obj;
        this.f21767w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it1(boolean z, rn3 rn3Var, Object obj, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21764t = (byte) 20;
        this.f21765u = z;
        this.f21766v = rn3Var;
        this.f21767w = obj;
    }
}
