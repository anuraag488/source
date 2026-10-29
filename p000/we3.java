package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class we3 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ long f33270A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ sw2 f33271B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ sw2 f33272C;

    /* JADX INFO: renamed from: t */
    public long f33273t;

    /* JADX INFO: renamed from: u */
    public boolean f33274u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ xz4 f33275v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ kr3 f33276w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC0755ia f33277x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0686gf f33278y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ wp1 f33279z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we3(xz4 xz4Var, kr3 kr3Var, InterfaceC0755ia interfaceC0755ia, C0686gf c0686gf, wp1 wp1Var, long j, sw2 sw2Var, sw2 sw2Var2, wm0 wm0Var) {
        super(2, wm0Var);
        this.f33275v = xz4Var;
        this.f33276w = kr3Var;
        this.f33277x = interfaceC0755ia;
        this.f33278y = c0686gf;
        this.f33279z = wp1Var;
        this.f33270A = j;
        this.f33271B = sw2Var;
        this.f33272C = sw2Var2;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        return new we3(this.f33275v, this.f33276w, this.f33277x, this.f33278y, this.f33279z, this.f33270A, this.f33271B, this.f33272C, wm0Var);
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((we3) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        long j;
        String str;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f33274u;
        if (!z) {
            k43.m7376J(obj);
            long jM12419a = wt2.m12419a();
            this.f33273t = jM12419a;
            this.f33274u = true;
            kj0 kj0Var = la1.f23888a;
            C0928n c0928n = new C0928n((byte) 7);
            c0928n.f25353b = this.f33276w;
            VarHandle.storeStoreFence();
            obj = this.f33275v.m12799b(new pg0(-2074583807, true, c0928n), this);
            if (obj == ap0Var) {
                return ap0Var;
            }
            j = jM12419a;
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f33273t;
            k43.m7376J(obj);
        }
        xs1 xs1Var = (xs1) obj;
        ws1 ws1Var = ws1.f33689a;
        InterfaceC0755ia interfaceC0755ia = this.f33277x;
        if (interfaceC0755ia != null) {
            Bundle bundle = new Bundle();
            boolean z2 = xs1Var instanceof vs1;
            if (z2) {
                str = "success";
            } else if (z62.m13387o(xs1Var, ws1Var)) {
                str = "trial";
            } else {
                if (xs1Var != null) {
                    C0670g.m5864c();
                    return null;
                }
                str = "dismissed";
            }
            bundle.putString("result", str);
            if (z2) {
                bundle.putString("product", ((vs1) xs1Var).f32829a.f26681a);
            }
            i41 i41VarM6644c = i41.m6644c(vm4.m11940a(j));
            i41 i41VarM6644c2 = i41.m6644c(as4.m3238Q(1, m41.MINUTES));
            if (i41VarM6644c.compareTo(i41VarM6644c2) > 0) {
                i41VarM6644c = i41VarM6644c2;
            }
            bundle.putLong("duration", i41.m6647f(i41VarM6644c.f21121a));
            interfaceC0755ia.mo6706b("go_premium_sheet_result", bundle);
        }
        this.f33278y.invoke(xs1Var);
        if (z62.m13387o(xs1Var, ws1Var)) {
            nc4 nc4Var = ze3.f36022a;
            this.f33271B.setValue(Boolean.TRUE);
            this.f33272C.setValue(i41.m6644c(i41.m6652k(((i41) this.f33279z.invoke()).f21121a, this.f33270A)));
        }
        return obj;
    }
}
