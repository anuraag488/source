package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pk6 implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f27720a;

    /* JADX INFO: renamed from: b */
    public int f27721b;

    /* JADX INFO: renamed from: c */
    public boolean f27722c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ on6 f27723d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        on6 on6Var;
        int i;
        int i2 = this.f27721b;
        while (true) {
            on6Var = this.f27723d;
            i = this.f27720a;
            if (i2 >= i || on6Var.f26919a.get(i2) != null) {
                break;
            }
            i2++;
        }
        this.f27721b = i2;
        if (i2 < i) {
            return true;
        }
        if (!this.f27722c) {
            this.f27722c = true;
            int i3 = on6Var.f26920b - 1;
            on6Var.f26920b = i3;
            if (i3 <= 0 && on6Var.f26922d) {
                on6Var.f26922d = false;
                ArrayList arrayList = on6Var.f26919a;
                if (arrayList != null) {
                    if (on6Var.f26921c == 0) {
                        on6Var.f26919a = null;
                        return false;
                    }
                    arrayList.removeAll(Collections.singleton(null));
                }
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            xy4.m12795x();
            return null;
        }
        on6 on6Var = this.f27723d;
        int i = this.f27721b;
        this.f27721b = i + 1;
        return on6Var.f26919a.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
