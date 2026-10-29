package p000;

import ads_mobile_sdk.n42;
import ads_mobile_sdk.r42;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class md0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f24825t = 1;

    /* JADX INFO: renamed from: u */
    public boolean f24826u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f24827v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f24828w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f24829x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f24830y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(si1[] si1VarArr, int i, AtomicInteger atomicInteger, f40 f40Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24828w = si1VarArr;
        this.f24827v = i;
        this.f24829x = atomicInteger;
        this.f24830y = f40Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f24825t;
        Object obj2 = this.f24830y;
        Object obj3 = this.f24829x;
        switch (b) {
            case 0:
                return new md0((si1[]) this.f24828w, this.f24827v, (AtomicInteger) obj3, (f40) obj2, wm0Var);
            default:
                md0 md0Var = new md0(this.f24827v, (r42) obj2, (o92) obj3, wm0Var);
                md0Var.f24828w = obj;
                return md0Var;
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24825t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((md0) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((md0) create((wm0) obj2, (mg3) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        byte b = this.f24825t;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f24830y;
        int i = this.f24827v;
        boolean z = true;
        Object obj3 = this.f24829x;
        switch (b) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                f40 f40Var = (f40) obj2;
                ap0 ap0Var = ap0.f14763a;
                boolean z2 = this.f24826u;
                try {
                    if (!z2) {
                        k43.m7376J(obj);
                        si1 si1Var = ((si1[]) this.f24828w)[i];
                        ld0 ld0Var = new ld0();
                        ld0Var.f23958a = f40Var;
                        ld0Var.f23959b = i;
                        VarHandle.storeStoreFence();
                        this.f24826u = true;
                        if (si1Var.collect(ld0Var, this) == ap0Var) {
                            return ap0Var;
                        }
                    } else {
                        if (!z2) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        k43.m7376J(obj);
                    }
                    if (atomicInteger.decrementAndGet() != 0) {
                        return ju4Var;
                    }
                    f40Var.m5485e(null);
                    return ju4Var;
                } catch (Throwable th) {
                    if (atomicInteger.decrementAndGet() == 0) {
                        f40Var.m5485e(null);
                    }
                    throw th;
                }
            default:
                ap0 ap0Var2 = ap0.f14763a;
                boolean z3 = this.f24826u;
                if (z3) {
                    if (z3) {
                        k43.m7376J(obj);
                        return ju4Var;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                mg3 mg3Var = (mg3) this.f24828w;
                int size = ((o92) obj3).f26491a.size();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < i) {
                    r42 r42Var = (r42) obj2;
                    arrayList.add(lb5.m7910S(r42Var.f10555t, null, null, new n42(r42Var, i2, size, (o92) obj3, mg3Var, null), 3));
                    i2++;
                    z = true;
                }
                this.f24826u = z;
                return vd6.m11822F(arrayList, this) == ap0Var2 ? ap0Var2 : ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md0(int i, r42 r42Var, o92 o92Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f24829x = o92Var;
        this.f24827v = i;
        this.f24830y = r42Var;
    }
}
