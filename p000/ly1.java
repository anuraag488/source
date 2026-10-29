package p000;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ly1 extends ii4 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f24461e = 2;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ oy1 f24462f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(String str, oy1 oy1Var, int i, int i2) {
        super(str, true);
        this.f24462f = oy1Var;
        this.f24463g = i;
    }

    @Override // p000.ii4
    /* JADX INFO: renamed from: a */
    public final long mo6810a() {
        switch (this.f24461e) {
            case 0:
                this.f24462f.f27217k.getClass();
                try {
                    this.f24462f.f27229w.m12446l(this.f24463g, 9);
                    synchronized (this.f24462f) {
                        this.f24462f.f27231y.remove(Integer.valueOf(this.f24463g));
                    }
                } catch (IOException unused) {
                }
                return -1L;
            case 1:
                this.f24462f.f27217k.getClass();
                try {
                    this.f24462f.f27229w.m12446l(this.f24463g, 9);
                    synchronized (this.f24462f) {
                        this.f24462f.f27231y.remove(Integer.valueOf(this.f24463g));
                    }
                } catch (IOException unused2) {
                }
                return -1L;
            default:
                this.f24462f.f27217k.getClass();
                synchronized (this.f24462f) {
                    this.f24462f.f27231y.remove(Integer.valueOf(this.f24463g));
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(String str, oy1 oy1Var, int i, List list) {
        super(str, true);
        this.f24462f = oy1Var;
        this.f24463g = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly1(String str, oy1 oy1Var, int i, List list, boolean z) {
        super(str, true);
        this.f24462f = oy1Var;
        this.f24463g = i;
    }
}
