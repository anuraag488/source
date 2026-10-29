package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class um5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31994a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31995b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f31996c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ t36 f31997d;

    public /* synthetic */ um5(byte b) {
        this.f31994a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31994a) {
            case 0:
                ly5 ly5Var = (ly5) this.f31997d;
                String str = (String) this.f31995b;
                long j = this.f31996c;
                ly5Var.mo5038t();
                y42.m12851X(str);
                C0805jo c0805jo = ly5Var.f24475g;
                if (c0805jo.isEmpty()) {
                    ly5Var.f24476h = j;
                }
                Integer num = (Integer) c0805jo.get(str);
                if (num != null) {
                    c0805jo.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (c0805jo.f34030c < 100) {
                    c0805jo.put(str, 1);
                    ly5Var.f24474f.put(str, Long.valueOf(j));
                } else {
                    d76 d76Var = ((oa6) ly5Var.f36084a).f26514f;
                    oa6.m9016l(d76Var);
                    d76Var.f16838m.m12504a("Too many ads visible");
                }
                break;
            case 1:
                ly5 ly5Var2 = (ly5) this.f31997d;
                String str2 = (String) this.f31995b;
                long j2 = this.f31996c;
                ly5Var2.mo5038t();
                y42.m12851X(str2);
                C0805jo c0805jo2 = ly5Var2.f24475g;
                Integer num2 = (Integer) c0805jo2.get(str2);
                oa6 oa6Var = (oa6) ly5Var2.f36084a;
                if (num2 == null) {
                    d76 d76Var2 = oa6Var.f26514f;
                    oa6.m9016l(d76Var2);
                    d76Var2.f16835j.m12505b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    uh6 uh6Var = oa6Var.f26520l;
                    d76 d76Var3 = oa6Var.f26514f;
                    oa6.m9015k(uh6Var);
                    eh6 eh6VarM11553A = uh6Var.m11553A(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        c0805jo2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        c0805jo2.remove(str2);
                        C0805jo c0805jo3 = ly5Var2.f24474f;
                        Long l = (Long) c0805jo3.get(str2);
                        if (l == null) {
                            oa6.m9016l(d76Var3);
                            d76Var3.f16835j.m12504a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j2 - l.longValue();
                            c0805jo3.remove(str2);
                            ly5Var2.m8153y(str2, jLongValue, eh6VarM11553A);
                        }
                        if (c0805jo2.isEmpty()) {
                            long j3 = ly5Var2.f24476h;
                            if (j3 != 0) {
                                ly5Var2.m8152x(j2 - j3, eh6VarM11553A);
                                ly5Var2.f24476h = 0L;
                            } else {
                                oa6.m9016l(d76Var3);
                                d76Var3.f16835j.m12504a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
            default:
                uh6 uh6Var2 = (uh6) this.f31997d;
                uh6Var2.m11558y((eh6) this.f31995b, false, this.f31996c);
                uh6Var2.f31882i = null;
                oj6 oj6VarM9027n = ((oa6) uh6Var2.f36084a).m9027n();
                oj6VarM9027n.mo5038t();
                oj6VarM9027n.m9741u();
                ar1 ar1Var = new ar1((byte) 26);
                ar1Var.f14798b = null;
                ar1Var.f14799c = oj6VarM9027n;
                VarHandle.storeStoreFence();
                oj6VarM9027n.m9140J(ar1Var);
                break;
        }
    }
}
