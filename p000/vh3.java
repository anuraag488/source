package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vh3 implements mw4 {

    /* JADX INFO: renamed from: a */
    public boolean f32620a;

    /* JADX INFO: renamed from: b */
    public boolean f32621b;

    /* JADX INFO: renamed from: c */
    public pe1 f32622c;

    /* JADX INFO: renamed from: d */
    public uh3 f32623d;

    @Override // p000.mw4
    /* JADX INFO: renamed from: b */
    public final mw4 mo8422b(String str) {
        if (this.f32620a) {
            throw new k81("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f32620a = true;
        this.f32623d.m11548i(this.f32622c, str, this.f32621b);
        return this;
    }

    @Override // p000.mw4
    /* JADX INFO: renamed from: c */
    public final mw4 mo8423c(boolean z) {
        if (this.f32620a) {
            throw new k81("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f32620a = true;
        this.f32623d.m11546c(this.f32622c, z ? 1 : 0, this.f32621b);
        return this;
    }
}
