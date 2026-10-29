package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gx1 {

    /* JADX INFO: renamed from: a */
    public final mq1 f20169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ byte f20170b;

    public gx1(mq1 mq1Var, byte b) {
        this.f20170b = b;
        this.f20169a = mq1Var;
    }

    /* JADX INFO: renamed from: a */
    public final float m6189a(float f, cf2 cf2Var, cf2 cf2Var2) {
        switch (this.f20170b) {
            case 0:
                return Float.intBitsToFloat((int) (cf2Var2.mo3998G(cf2Var, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(((int) (cf2Var.mo4004R() >> 32)) / 2.0f) << 32)) & 4294967295L));
            default:
                return Float.intBitsToFloat((int) (cf2Var2.mo3998G(cf2Var, (((long) Float.floatToRawIntBits(((int) (cf2Var.mo4004R() & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)) >> 32));
        }
    }
}
