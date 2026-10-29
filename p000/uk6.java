package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uk6 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31960a;

    /* JADX INFO: renamed from: b */
    public int f31961b;

    /* JADX INFO: renamed from: c */
    public boolean f31962c;

    /* JADX INFO: renamed from: d */
    public Iterator f31963d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ AbstractMap f31964e;

    public /* synthetic */ uk6(byte b) {
        this.f31960a = b;
    }

    /* JADX INFO: renamed from: a */
    public final Iterator m11581a() {
        switch (this.f31960a) {
            case 0:
                Iterator it = this.f31963d;
                if (it != null) {
                    return it;
                }
                Iterator it2 = ((lk6) this.f31964e).f24113c.entrySet().iterator();
                this.f31963d = it2;
                return it2;
            default:
                Iterator it3 = this.f31963d;
                if (it3 != null) {
                    return it3;
                }
                Iterator it4 = ((mq6) this.f31964e).f25157c.entrySet().iterator();
                this.f31963d = it4;
                return it4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f31960a) {
            case 0:
                int i = this.f31961b + 1;
                lk6 lk6Var = (lk6) this.f31964e;
                if (i >= lk6Var.f24112b) {
                    return !lk6Var.f24113c.isEmpty() && m11581a().hasNext();
                }
                return true;
            default:
                int i2 = this.f31961b + 1;
                mq6 mq6Var = (mq6) this.f31964e;
                if (i2 >= mq6Var.f25156b) {
                    return !mq6Var.f25157c.isEmpty() && m11581a().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f31960a) {
            case 0:
                this.f31962c = true;
                int i = this.f31961b + 1;
                this.f31961b = i;
                lk6 lk6Var = (lk6) this.f31964e;
                return i < lk6Var.f24112b ? (sk6) lk6Var.f24111a[i] : (Map.Entry) m11581a().next();
            default:
                this.f31962c = true;
                int i2 = this.f31961b + 1;
                this.f31961b = i2;
                mq6 mq6Var = (mq6) this.f31964e;
                return i2 < mq6Var.f25156b ? (nq6) mq6Var.f25155a[i2] : (Map.Entry) m11581a().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31960a) {
            case 0:
                if (!this.f31962c) {
                    C1077qn.m9989o("remove() was called before next()");
                } else {
                    this.f31962c = false;
                    lk6 lk6Var = (lk6) this.f31964e;
                    lk6Var.m8007f();
                    int i = this.f31961b;
                    if (i >= lk6Var.f24112b) {
                        m11581a().remove();
                    } else {
                        this.f31961b = i - 1;
                        lk6Var.m8005d(i);
                    }
                }
                break;
            default:
                if (!this.f31962c) {
                    C1077qn.m9989o("remove() was called before next()");
                } else {
                    this.f31962c = false;
                    mq6 mq6Var = (mq6) this.f31964e;
                    int i2 = mq6.f25154g;
                    mq6Var.m8384h();
                    int i3 = this.f31961b;
                    if (i3 >= mq6Var.f25156b) {
                        m11581a().remove();
                    } else {
                        this.f31961b = i3 - 1;
                        mq6Var.m8382e(i3);
                    }
                }
                break;
        }
    }
}
