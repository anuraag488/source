package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public interface ky0 {
    /* JADX INFO: renamed from: A0 */
    default float mo3572A0(float f) {
        return f / mo3580c();
    }

    /* JADX INFO: renamed from: C */
    default long mo3573C(float f) {
        float[] fArr = rm1.f29410a;
        if (mo3585r() < 1.03f) {
            return vd6.m11825I(4294967296L, f / mo3585r());
        }
        qm1 qm1VarM10370a = rm1.m10370a(mo3585r());
        return vd6.m11825I(4294967296L, qm1VarM10370a != null ? qm1VarM10370a.mo5729a(f) : f / mo3585r());
    }

    /* JADX INFO: renamed from: D */
    default long mo3574D(long j) {
        if (j != 9205357640488583168L) {
            return dt0.m4704f(mo3572A0(Float.intBitsToFloat((int) (j >> 32))), mo3572A0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: E */
    default float mo3575E(float f) {
        return mo3580c() * f;
    }

    /* JADX INFO: renamed from: O */
    default float mo3577O(long j) {
        if (!cm4.m4048b(bm4.m3633c(j), 4294967296L)) {
            s32.m10515b("Only Sp can convert to Px");
        }
        float[] fArr = rm1.f29410a;
        if (mo3585r() < 1.03f) {
            return mo3585r() * bm4.m3634d(j);
        }
        qm1 qm1VarM10370a = rm1.m10370a(mo3585r());
        if (qm1VarM10370a != null) {
            return qm1VarM10370a.mo5730b(bm4.m3634d(j));
        }
        return mo3585r() * bm4.m3634d(j);
    }

    /* JADX INFO: renamed from: U */
    default int mo3579U(float f) {
        float fMo3575E = mo3575E(f);
        if (Float.isInfinite(fMo3575E)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo3575E);
    }

    /* JADX INFO: renamed from: c */
    float mo3580c();

    /* JADX INFO: renamed from: c0 */
    default long mo3581c0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo3575E = mo3575E(t11.m10960b(j));
        float fMo3575E2 = mo3575E(t11.m10959a(j));
        return (((long) Float.floatToRawIntBits(fMo3575E)) << 32) | (((long) Float.floatToRawIntBits(fMo3575E2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h0 */
    default float mo3582h0(long j) {
        if (!cm4.m4048b(bm4.m3633c(j), 4294967296L)) {
            s32.m10515b("Only Sp can convert to Px");
        }
        return mo3575E(mo3577O(j));
    }

    /* JADX INFO: renamed from: o0 */
    default long mo3584o0(float f) {
        return mo3573C(mo3572A0(f));
    }

    /* JADX INFO: renamed from: r */
    float mo3585r();

    /* JADX INFO: renamed from: w0 */
    default float mo3586w0(int i) {
        return i / mo3580c();
    }
}
