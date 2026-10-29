package p000;

import ads_mobile_sdk.g80;
import ads_mobile_sdk.i52;
import ads_mobile_sdk.rc2;
import java.lang.invoke.VarHandle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ai */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0455ai extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f14514t;

    /* JADX INFO: renamed from: u */
    public boolean f14515u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f14516v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f14517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0455ai(byte b, long j, wm0 wm0Var, Object obj) {
        super(2, wm0Var);
        this.f14514t = b;
        this.f14517w = obj;
        this.f14516v = j;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f14514t;
        Object obj2 = this.f14517w;
        switch (b) {
            case 0:
                return new C0455ai((byte) 0, this.f14516v, wm0Var, (AbstractC0492bi) obj2);
            case 1:
                return new C0455ai((byte) 1, this.f14516v, wm0Var, (si1) obj2);
            case 2:
                return new C0455ai((byte) 2, this.f14516v, wm0Var, (C0910mi) obj2);
            case 3:
                return new C0455ai((byte) 3, this.f14516v, wm0Var, (rc2) obj2);
            case 4:
                return new C0455ai((byte) 4, this.f14516v, wm0Var, (g80) obj2);
            default:
                return new C0455ai((byte) 5, this.f14516v, wm0Var, (x72) obj2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14514t;
        Object obj3 = this.f14517w;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0455ai) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0455ai) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C0455ai) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return new C0455ai((byte) 3, this.f14516v, (wm0) obj2, (rc2) obj3).invokeSuspend(ju4Var);
            case 4:
                return new C0455ai((byte) 4, this.f14516v, (wm0) obj2, (g80) obj3).invokeSuspend(ju4Var);
            default:
                return new C0455ai((byte) 5, this.f14516v, (wm0) obj2, (x72) obj3).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f14514t;
        long j = this.f14516v;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f14517w;
        switch (b) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f14515u;
                if (!z) {
                    k43.m7376J(obj);
                    g03 g03Var = ((AbstractC0492bi) obj2).f15284a;
                    this.f14515u = true;
                    return g03Var.m5871b(j, this) == ap0Var ? ap0Var : ju4Var;
                }
                if (z) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f14515u;
                if (z2) {
                    if (z2) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                hx3 hx3Var = new hx3();
                hx3Var.f20912a = (si1) obj2;
                hx3Var.f20913b = j;
                VarHandle.storeStoreFence();
                dx3 dx3Var = new dx3(3, null);
                int i = pj1.f27653a;
                l80 l80Var = new l80(dx3Var, hx3Var, r71.f29063a, -2, y30.f34832a);
                this.f14515u = true;
                return lb5.m7901I(l80Var, this) == ap0Var2 ? ap0Var2 : ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f14515u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                b33 b33VarM3423a = b33.m3423a(j);
                db4 db4Var = b14.f15027d;
                this.f14515u = true;
                return C0910mi.m8325a((C0910mi) obj2, b33VarM3423a, db4Var, null, this, 12) == ap0Var3 ? ap0Var3 : ju4Var;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f14515u;
                if (!z4) {
                    k43.m7376J(obj);
                    this.f14515u = true;
                    return ((rc2) obj2).m2100a(this.f14516v, null, null, false, this) == ap0Var4 ? ap0Var4 : ju4Var;
                }
                if (z4) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f14515u;
                if (z5) {
                    if (z5) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                g80 g80Var = (g80) obj2;
                AtomicReference atomicReference = g80Var.f3858m;
                v82 v82Var = g80Var.f3860o;
                Long l = new Long(j);
                this.f14515u = true;
                return g80Var.m1031a(atomicReference, v82Var, l, this) == ap0Var5 ? ap0Var5 : ju4Var;
            default:
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f14515u;
                if (!z6) {
                    k43.m7376J(obj);
                    i52 i52Var = (i52) ((x72) obj2).f34039d;
                    this.f14515u = true;
                    return i52Var.m1265e(j, this) == ap0Var6 ? ap0Var6 : ju4Var;
                }
                if (z6) {
                    k43.m7376J(obj);
                    return ju4Var;
                }
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
