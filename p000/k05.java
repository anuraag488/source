package p000;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class k05 {

    /* JADX INFO: renamed from: a */
    public final Rect[][] f22802a;

    /* JADX INFO: renamed from: b */
    public final Rect[][] f22803b;

    public k05(w05 w05Var) {
        this.f22802a = new Rect[10][];
        this.f22803b = new Rect[10][];
        mo6537c(w05Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract w05 mo4837b();

    /* JADX INFO: renamed from: c */
    public void mo6537c(w05 w05Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> listMo7775f = w05Var.f33012a.mo7775f(i);
            int iM10036t = qq2.m10036t(i);
            this.f22802a[iM10036t] = (Rect[]) listMo7775f.toArray(new Rect[listMo7775f.size()]);
            if (i != 8) {
                List<Rect> listMo7776g = w05Var.f33012a.mo7776g(i);
                this.f22803b[iM10036t] = (Rect[]) listMo7776g.toArray(new Rect[listMo7776g.size()]);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo4838d(g42 g42Var);

    /* JADX INFO: renamed from: e */
    public abstract void mo4839e(g42 g42Var);

    public k05() {
        this(new w05(null));
    }

    /* JADX INFO: renamed from: a */
    public final void m7354a() {
    }
}
