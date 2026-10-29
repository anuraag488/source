package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z81 implements d03 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ a91 f35866a;

    @Override // p000.d03
    /* JADX INFO: renamed from: Q */
    public final long mo4257Q(long j, int i, long j2) {
        a91 a91Var = this.f35866a;
        if (!((Boolean) a91Var.f179d.invoke()).booleanValue()) {
            return 0L;
        }
        ho4 ho4Var = a91Var.f176a;
        ho4Var.f20757b.m13400i(Float.intBitsToFloat((int) (j & 4294967295L)) + ho4Var.f20757b.m13399h());
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p000.d03
    /* JADX INFO: renamed from: R */
    public final Object mo4258R(long j, long j2, wm0 wm0Var) {
        y81 y81Var;
        long j3;
        a91 a91Var = this.f35866a;
        ho4 ho4Var = a91Var.f176a;
        if (wm0Var instanceof y81) {
            y81Var = (y81) wm0Var;
            int i = y81Var.f35019y;
            if ((i & Integer.MIN_VALUE) != 0) {
                y81Var.f35019y = i - Integer.MIN_VALUE;
            } else {
                y81Var = new y81(this, (ym0) wm0Var);
            }
        } else {
            y81Var = new y81(this, (ym0) wm0Var);
        }
        Object objM7330a = y81Var.f35017w;
        Object obj = ap0.f14763a;
        int i2 = y81Var.f35019y;
        if (i2 == 0) {
            k43.m7376J(objM7330a);
            if (jx4.m7333d(j2) > 0.0f) {
                ho4Var.f20757b.m13400i(0.0f);
            }
            y81Var.f35014t = j;
            y81Var.f35015u = j2;
            y81Var.f35019y = 1;
            objM7330a = jx4.m7330a(0L);
            if (objM7330a != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            j2 = y81Var.f35015u;
            j = y81Var.f35014t;
            k43.m7376J(objM7330a);
        } else {
            if (i2 != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = y81Var.f35016v;
            k43.m7376J(objM7330a);
        }
        return jx4.m7330a(jx4.m7335f(j3, ((jx4) objM7330a).f22730a));
        long j4 = ((jx4) objM7330a).f22730a;
        float fM7333d = jx4.m7333d(j2);
        gv0 gv0Var = a91Var.f178c;
        ag1 ag1Var = a91Var.f177b;
        y81Var.f35014t = j;
        y81Var.f35015u = j2;
        y81Var.f35016v = j4;
        y81Var.f35019y = 2;
        objM7330a = AbstractC0913ml.m8343d(ho4Var, fM7333d, gv0Var, ag1Var, y81Var);
        if (objM7330a != obj) {
            j3 = j4;
            return jx4.m7330a(jx4.m7335f(j3, ((jx4) objM7330a).f22730a));
        }
        return obj;
    }

    @Override // p000.d03
    /* JADX INFO: renamed from: p0 */
    public final long mo4260p0(int i, long j) {
        a91 a91Var = this.f35866a;
        ho4 ho4Var = a91Var.f176a;
        if (!((Boolean) a91Var.f179d.invoke()).booleanValue()) {
            return 0L;
        }
        float fM13399h = ho4Var.f20759d.m13399h();
        ho4Var.m6465b(Float.intBitsToFloat((int) (4294967295L & j)) + ho4Var.f20759d.m13399h());
        if (fM13399h == ho4Var.f20759d.m13399h()) {
            return 0L;
        }
        return b33.m3424b(j, 0.0f, 2);
    }
}
