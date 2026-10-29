package p000;

import ads_mobile_sdk.da4;
import ads_mobile_sdk.n94;
import ads_mobile_sdk.ua4;
import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class dx4 implements yw4 {

    /* JADX INFO: renamed from: a */
    public long f17482a;

    /* JADX INFO: renamed from: b */
    public long f17483b;

    /* JADX INFO: renamed from: c */
    public Object f17484c;

    /* JADX INFO: renamed from: d */
    public Object f17485d;

    /* JADX INFO: renamed from: a */
    public static dx4 m4790a(n94 n94Var, byte[] bArr, boolean z) {
        byte[] bArr2;
        n94Var.m1753a();
        ua4 ua4Var = n94Var.f7594a;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        ua4Var.f12242c.f32549b = new da4(bArr2);
        List list = (List) n94Var.m1752a(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        n94Var.m1751a(jLongValue, Optional.empty());
        StringBuilder sb = new StringBuilder("3.996215036.");
        sb.append(C1087qx.f28856d.m10150c(n94.m1750b()));
        sb.append(z ? "-s" : "");
        String string = sb.toString();
        dx4 dx4Var = new dx4();
        dx4Var.f17484c = n94Var;
        dx4Var.f17482a = jLongValue2;
        dx4Var.f17483b = jLongValue3;
        dx4Var.f17485d = string;
        VarHandle.storeStoreFence();
        return dx4Var;
    }

    /* JADX INFO: renamed from: b */
    public long m4791b(long j) {
        long j2 = this.f17483b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f17482a;
        long j5 = j3 / j4;
        return (((sn3) this.f17485d) == sn3.f30409a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: c */
    public long mo3358c(AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0654fk m4792d(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        long j2 = this.f17483b;
        long j3 = j + j2;
        long j4 = this.f17482a;
        return j3 > j4 ? ((ax4) this.f17484c).mo4794p(j4 - j2, abstractC0654fk, abstractC0654fk3, abstractC0654fk2) : abstractC0654fk2;
    }

    /* JADX INFO: renamed from: e */
    public boolean m4793e(boolean z, boolean z2, long j) {
        vk6 vk6Var = (vk6) this.f17485d;
        vk6Var.mo5038t();
        vk6Var.m9741u();
        oa6 oa6Var = (oa6) vk6Var.f36084a;
        boolean zM9018a = oa6Var.m9018a();
        d76 d76Var = oa6Var.f26514f;
        if (zM9018a) {
            s86 s86Var = oa6Var.f26513e;
            oa6.m9014j(s86Var);
            n86 n86Var = s86Var.f29975N;
            oa6Var.f26519k.getClass();
            n86Var.m8624b(System.currentTimeMillis());
        }
        long j2 = j - this.f17482a;
        if (!z && j2 < 1000) {
            oa6.m9016l(d76Var);
            d76Var.f16831L.m12505b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.f17483b;
            this.f17483b = j;
        }
        oa6.m9016l(d76Var);
        d76Var.f16831L.m12505b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !oa6Var.f26512d.m9229I();
        uh6 uh6Var = oa6Var.f26520l;
        oa6.m9015k(uh6Var);
        dn6.m4574l0(uh6Var.m11553A(z3), bundle, true);
        if (!z2) {
            mg6 mg6Var = oa6Var.f26521m;
            oa6.m9015k(mg6Var);
            mg6Var.m8301B("auto", "_e", bundle);
        }
        this.f17482a = j;
        kk6 kk6Var = (kk6) this.f17484c;
        kk6Var.m6924c();
        kk6Var.m6923b(((Long) e56.f17812q0.m4379a(null)).longValue());
        return true;
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: p */
    public AbstractC0654fk mo4794p(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((ax4) this.f17484c).mo4794p(m4791b(j), abstractC0654fk, abstractC0654fk2, m4792d(j, abstractC0654fk, abstractC0654fk3, abstractC0654fk2));
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: s */
    public AbstractC0654fk mo4795s(long j, AbstractC0654fk abstractC0654fk, AbstractC0654fk abstractC0654fk2, AbstractC0654fk abstractC0654fk3) {
        return ((ax4) this.f17484c).mo4795s(m4791b(j), abstractC0654fk, abstractC0654fk2, m4792d(j, abstractC0654fk, abstractC0654fk3, abstractC0654fk2));
    }

    @Override // p000.yw4
    /* JADX INFO: renamed from: a */
    public boolean mo3759a() {
        return true;
    }
}
