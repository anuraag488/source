package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l20 extends ue2 implements yp1 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ byte f23720i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f23721j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f23722k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(db3 db3Var, r45 r45Var) {
        super(1);
        this.f23720i = (byte) 4;
        this.f23722k = db3Var;
        this.f23721j = r45Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    @Override // p000.yp1
    public final Object invoke(Object obj) {
        long jM7169e;
        byte b = this.f23720i;
        boolean z = true;
        jl3 jl3VarM5672j = null;
        ju4 ju4Var = ju4.f22634a;
        Object obj2 = this.f23722k;
        Object obj3 = this.f23721j;
        switch (b) {
            case 0:
                cb3 cb3Var = (cb3) obj;
                m20 m20Var = (m20) obj3;
                n20 n20Var = m20Var.f24588s;
                jl3 jl3Var = n20Var.m8477a() ? null : (jl3) n20Var.f25402g.getValue();
                zo2 zo2Var = m20Var.f24584o;
                cf2 cf2VarMo3948b = cb3Var.mo3948b();
                b33 b33VarM3423a = cf2VarMo3948b != null ? b33.m3423a(zo2Var.mo3109b().mo4006V(cf2VarMo3948b, 0L, false)) : null;
                if (jl3Var != null) {
                    long jM7169e2 = jl3Var.m7169e();
                    long jM7168d = jl3Var.m7168d();
                    n20Var.f25400e = jM7169e2;
                    n20Var.f25401f = jM7168d;
                    jM7169e = jl3Var.m7169e();
                } else {
                    long j = n20Var.f25401f;
                    long j2 = n20Var.f25400e;
                    if ((j2 & 9223372034707292159L) != 9205357640488583168L && j != 9205357640488583168L) {
                        jl3VarM5672j = AbstractC0647fd.m5672j(j2, j);
                    }
                    jM7169e = jl3VarM5672j != null ? jl3VarM5672j.m7169e() : 0L;
                }
                long jM3429g = b33VarM3423a != null ? b33.m3429g(jM7169e, b33VarM3423a.f15059a) : 0L;
                cb3Var.m3952k((db3) obj2, Math.round(Float.intBitsToFloat((int) (jM3429g >> 32))), Math.round(Float.intBitsToFloat((int) (jM3429g & 4294967295L))), 0.0f);
                return ju4Var;
            case 1:
                Throwable th = (Throwable) obj;
                m60 m60Var = (m60) obj3;
                if (th == null) {
                    m60Var.m8198a(((ix0) obj2).m4977I());
                } else if (th instanceof CancellationException) {
                    m60Var.f24681d = true;
                    p60 p60Var = m60Var.f24679b;
                    if (p60Var != null && p60Var.f27392b.cancel(true)) {
                        m60Var.f24678a = null;
                        m60Var.f24679b = null;
                        m60Var.f24680c = null;
                    }
                } else {
                    m60Var.m8199b(th);
                }
                return ju4Var;
            case 2:
                cf2 cf2Var = (cf2) obj;
                ((sw2) obj3).setValue(b33.m3423a(cf2Var.mo4005S(0L)));
                ((sw2) obj2).setValue(w52.m12106a(cf2Var.mo4004R()));
                return ju4Var;
            case 3:
                qn3 qn3Var = (qn3) obj;
                qn3 qn3Var2 = (qn3) obj2;
                rn3 rn3Var = (rn3) obj3;
                if (rn3Var.f29457r.contains(qn3Var.f28622a.f25855j)) {
                    int iOrdinal = rn3Var.f29446g.ordinal();
                    if (iOrdinal == 0) {
                        int iOrdinal2 = rn3Var.m10377d().ordinal();
                        if (iOrdinal2 != 0) {
                            if (iOrdinal2 != 1) {
                                C0670g.m5864c();
                                return null;
                            }
                            if (((int) (qn3Var.m9991a() & 4294967295L)) != ((int) (qn3Var2.m9991a() & 4294967295L))) {
                                z = false;
                            }
                        } else if (((int) (qn3Var.m9991a() >> 32)) != ((int) (qn3Var2.m9991a() >> 32))) {
                            z = false;
                        }
                    } else if (iOrdinal != 1) {
                        C0670g.m5864c();
                        return null;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((cb3) obj).m3952k((db3) obj2, 0, 0, ((r45) obj3).f29008o);
                return ju4Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l20(Object obj, Object obj2, byte b) {
        super(1);
        this.f23720i = b;
        this.f23721j = obj;
        this.f23722k = obj2;
    }
}
