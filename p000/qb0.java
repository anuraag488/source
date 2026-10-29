package p000;

import java.lang.invoke.VarHandle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb0 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f28351a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ int f28352b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28353c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f28354d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28355e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f28356f;

    public /* synthetic */ qb0(byte b) {
        this.f28351a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f28351a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                int i = this.f28352b;
                yp1 yp1Var = (yp1) this.f28353c;
                sw2 sw2Var = (sw2) this.f28354d;
                sw2 sw2Var2 = (sw2) this.f28355e;
                List list = (List) this.f28356f;
                vg2 vg2Var = (vg2) obj;
                sb0 sb0Var = new sb0((byte) 1);
                sb0Var.f30047b = i;
                sb0Var.f30048c = yp1Var;
                sb0Var.f30049d = sw2Var;
                sb0Var.f30050e = sw2Var2;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, null, sb0Var, 3);
                nh2 nh2Var = new nh2((byte) 2);
                nh2Var.f25807d = list;
                nh2Var.f25805b = yp1Var;
                nh2Var.f25806c = sw2Var;
                nh2Var.f25808e = sw2Var2;
                VarHandle.storeStoreFence();
                oi2.m9121c(vg2Var, null, new pg0(-568089427, true, nh2Var), 3);
                C1164t c1164t = new C1164t((byte) 7);
                c1164t.f30699b = yp1Var;
                c1164t.f30700c = sw2Var;
                c1164t.f30701d = sw2Var2;
                VarHandle.storeStoreFence();
                mz3.m8469k(vg2Var, null, c1164t, 3);
                return ju4Var;
            case 1:
                db3[] db3VarArr = (db3[]) this.f28353c;
                id0 id0Var = (id0) this.f28354d;
                int i2 = this.f28352b;
                zq2 zq2Var = (zq2) this.f28355e;
                int[] iArr = (int[]) this.f28356f;
                cb3 cb3Var = (cb3) obj;
                int length = db3VarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length) {
                    db3 db3Var = db3VarArr[i3];
                    db3Var.mo4423m();
                    cb3Var.m3952k(db3Var, id0Var.f21275b.m6970a(db3Var.f16899a, i2, zq2Var.getLayoutDirection()), iArr[i4], 0.0f);
                    i3++;
                    i4++;
                }
                return ju4Var;
            default:
                sl1 sl1Var = (sl1) this.f28353c;
                sl1 sl1Var2 = (sl1) this.f28354d;
                jl3 jl3Var = (jl3) this.f28355e;
                int i5 = this.f28352b;
                C1164t c1164t2 = (C1164t) this.f28356f;
                InterfaceC0706gz interfaceC0706gz = (InterfaceC0706gz) obj;
                if (sl1Var != ((bl1) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(sl1Var2)).getFocusOwner()).m3620f()) {
                    return Boolean.TRUE;
                }
                boolean zM12829G0 = y42.m12829G0(i5, c1164t2, sl1Var2, jl3Var);
                Boolean boolValueOf = Boolean.valueOf(zM12829G0);
                if (zM12829G0 || !interfaceC0706gz.mo2992a()) {
                    return boolValueOf;
                }
                return null;
        }
    }
}
