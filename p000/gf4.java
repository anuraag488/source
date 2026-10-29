package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class gf4 implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final uo1 f19769a;

    /* JADX INFO: renamed from: b */
    public final String f19770b;

    /* JADX INFO: renamed from: c */
    public boolean f19771c;

    public gf4(uo1 uo1Var, String str) {
        this.f19769a = uo1Var;
        this.f19770b = str;
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo5108E(int i, byte[] bArr);

    /* JADX INFO: renamed from: a */
    public abstract void mo5109a(int i, String str);

    /* JADX INFO: renamed from: b */
    public String mo5110b(int i) {
        m6000j();
        zy5.m13857U(21, "no row");
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo5112g();

    public byte[] getBlob(int i) {
        m6000j();
        zy5.m13857U(21, "no row");
        throw null;
    }

    public int getColumnCount() {
        m6000j();
        return 0;
    }

    public String getColumnName(int i) {
        m6000j();
        zy5.m13857U(21, "no row");
        throw null;
    }

    public long getLong(int i) {
        m6000j();
        zy5.m13857U(21, "no row");
        throw null;
    }

    public boolean isNull(int i) {
        m6000j();
        zy5.m13857U(21, "no row");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final void m6000j() {
        if (this.f19771c) {
            zy5.m13857U(21, "statement is closed");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo5115m(int i);

    /* JADX INFO: renamed from: z */
    public abstract void mo5117z(int i, long j);

    /* JADX INFO: renamed from: e */
    public void mo5111e() {
    }
}
