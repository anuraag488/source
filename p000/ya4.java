package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ya4 extends ab4 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ w42 f35072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya4(w42 w42Var, wd3 wd3Var, CharSequence charSequence) {
        super(wd3Var, charSequence);
        this.f35072f = w42Var;
    }

    @Override // p000.ab4
    /* JADX INFO: renamed from: b */
    public final int mo176b(int i) {
        Object obj = this.f35072f.f33090b;
        CharSequence charSequence = this.f234c;
        int length = charSequence.length();
        dt0.m4720v(i, length);
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
