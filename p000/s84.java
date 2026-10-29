package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class s84 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29969a;

    /* JADX INFO: renamed from: b */
    public int f29970b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f29971c;

    public /* synthetic */ s84(byte b) {
        this.f29969a = b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f29969a) {
            case 0:
                t84 t84Var = (t84) this.f29971c;
                int i = t84.f30997e;
                return this.f29970b + 1 < t84Var.f30999b;
            case 1:
                return this.f29970b < ((do5) this.f29971c).m4628t();
            default:
                nw5 nw5Var = (nw5) this.f29971c;
                int i2 = nw5.f26154e;
                return this.f29970b + 1 < nw5Var.f26156b;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f29969a) {
            case 0:
                t84 t84Var = (t84) this.f29971c;
                int i = t84.f30997e;
                if (hasNext()) {
                    Object[] objArr = t84Var.f30998a;
                    int i2 = this.f29970b + 1;
                    this.f29970b = i2;
                    if (objArr[i2] != null) {
                        xy4.m12778e();
                    }
                } else {
                    xy4.m12795x();
                }
                return null;
            case 1:
                do5 do5Var = (do5) this.f29971c;
                int i3 = this.f29970b;
                int iM4628t = do5Var.m4628t();
                int i4 = this.f29970b;
                if (i3 < iM4628t) {
                    this.f29970b = i4 + 1;
                    return do5Var.m4629u(i4);
                }
                StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 21);
                sb.append("Out of bounds index: ");
                sb.append(i4);
                throw new NoSuchElementException(sb.toString());
            default:
                nw5 nw5Var = (nw5) this.f29971c;
                int i5 = nw5.f26154e;
                if (hasNext()) {
                    Object[] objArr2 = nw5Var.f26155a;
                    int i6 = this.f29970b + 1;
                    this.f29970b = i6;
                    c75.m3884p(objArr2[i6]);
                } else {
                    xy4.m12795x();
                }
                return null;
        }
    }
}
