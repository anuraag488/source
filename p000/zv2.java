package p000;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zv2 implements ListIterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f36411a;

    /* JADX INFO: renamed from: b */
    public final List f36412b;

    /* JADX INFO: renamed from: c */
    public int f36413c;

    public zv2(List list, int i, byte b) {
        this.f36411a = b;
        switch (b) {
            case 1:
                this.f36412b = list;
                this.f36413c = i;
                break;
            default:
                this.f36412b = list;
                this.f36413c = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                int i = this.f36413c + 1;
                this.f36413c = i;
                list.add(i, obj);
                break;
            default:
                list.add(this.f36413c, obj);
                this.f36413c++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                return this.f36413c < list.size() - 1;
            default:
                return this.f36413c < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f36411a) {
            case 0:
                return this.f36413c >= 0;
            default:
                return this.f36413c > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                int i = this.f36413c + 1;
                this.f36413c = i;
                return list.get(i);
            default:
                int i2 = this.f36413c;
                this.f36413c = i2 + 1;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f36411a) {
            case 0:
                return this.f36413c + 1;
            default:
                return this.f36413c;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                int i = this.f36413c;
                this.f36413c = i - 1;
                return list.get(i);
            default:
                int i2 = this.f36413c - 1;
                this.f36413c = i2;
                return list.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f36411a) {
            case 0:
                return this.f36413c;
            default:
                return this.f36413c - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                list.remove(this.f36413c);
                this.f36413c--;
                break;
            default:
                int i = this.f36413c - 1;
                this.f36413c = i;
                list.remove(i);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.f36411a;
        List list = this.f36412b;
        switch (b) {
            case 0:
                list.set(this.f36413c, obj);
                break;
            default:
                list.set(this.f36413c, obj);
                break;
        }
    }
}
