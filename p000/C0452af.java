package p000;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: af */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0452af implements p73 {

    /* JADX INFO: renamed from: a */
    public String f14417a;

    /* JADX INFO: renamed from: b */
    public xl4 f14418b;

    /* JADX INFO: renamed from: c */
    public List f14419c;

    /* JADX INFO: renamed from: d */
    public am1 f14420d;

    /* JADX INFO: renamed from: e */
    public ky0 f14421e;

    /* JADX INFO: renamed from: f */
    public C0798jh f14422f;

    /* JADX INFO: renamed from: g */
    public CharSequence f14423g;

    /* JADX INFO: renamed from: h */
    public if2 f14424h;

    /* JADX INFO: renamed from: i */
    public tt2 f14425i;

    /* JADX INFO: renamed from: j */
    public boolean f14426j;

    /* JADX INFO: renamed from: k */
    public int f14427k;

    /* JADX INFO: renamed from: l */
    public int f14428l;

    @Override // p000.p73
    /* JADX INFO: renamed from: a */
    public final float mo2950a() {
        if2 if2Var = this.f14424h;
        float f = if2Var.f21335e;
        TextPaint textPaint = if2Var.f21332b;
        if (!Float.isNaN(f)) {
            return if2Var.f21335e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = if2Var.f21331a;
        lineInstance.setText(new w80(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, k43.f22878w);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new r52(i, next, 1));
            } else {
                r52 r52Var = (r52) priorityQueue.peek();
                if (r52Var != null && r52Var.f27383b - r52Var.f27382a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new r52(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                xy4.m12795x();
                return 0.0f;
            }
            r52 r52Var2 = (r52) it.next();
            desiredWidth = Layout.getDesiredWidth(if2Var.m6790a(), r52Var2.f27382a, r52Var2.f27383b, textPaint);
            while (it.hasNext()) {
                r52 r52Var3 = (r52) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(if2Var.m6790a(), r52Var3.f27382a, r52Var3.f27383b, textPaint));
            }
        }
        if2Var.f21335e = desiredWidth;
        return desiredWidth;
    }

    @Override // p000.p73
    /* JADX INFO: renamed from: b */
    public final boolean mo2951b() {
        tt2 tt2Var = this.f14425i;
        if (tt2Var != null ? tt2Var.m11154v() : false) {
            return true;
        }
        if (!this.f14426j && zt5.m13790w(this.f14418b)) {
            int i = y70.f34987r;
            if (Boolean.FALSE.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.p73
    /* JADX INFO: renamed from: c */
    public final float mo2952c() {
        return this.f14424h.m6791b();
    }
}
