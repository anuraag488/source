package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bw2 implements List, dc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f15657a;

    /* JADX INFO: renamed from: b */
    public final List f15658b;

    /* JADX INFO: renamed from: c */
    public final int f15659c;

    /* JADX INFO: renamed from: d */
    public int f15660d;

    public /* synthetic */ bw2(List list, int i, int i2, byte b) {
        this.f15657a = b;
        this.f15658b = list;
        this.f15659c = i;
        this.f15660d = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.f15657a;
        int i2 = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.f15660d++;
                break;
            default:
                list.add(i + i2, obj);
                this.f15660d++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.f15657a;
        int i2 = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                list.addAll(i + i2, collection);
                this.f15660d = collection.size() + this.f15660d;
                return collection.size() > 0;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.f15660d += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.f15657a;
        List list = this.f15658b;
        int i = this.f15659c;
        switch (b) {
            case 0:
                int i2 = this.f15660d - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.f15660d = i;
                break;
            default:
                int i3 = this.f15660d - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.f15660d = i;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.f15657a;
        List list = this.f15658b;
        int i = this.f15659c;
        switch (b) {
            case 0:
                int i2 = this.f15660d;
                while (i < i2) {
                    if (z62.m13387o(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.f15660d;
                while (i < i3) {
                    if (z62.m13387o(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f15657a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.f15657a;
        int i2 = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                q23.m9714a(this, i);
                break;
            default:
                vw2.m12009a(this, i);
                break;
        }
        return list.get(i + i2);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.f15657a;
        List list = this.f15658b;
        int i = this.f15659c;
        switch (b) {
            case 0:
                int i2 = this.f15660d;
                for (int i3 = i; i3 < i2; i3++) {
                    if (z62.m13387o(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.f15660d;
                for (int i5 = i; i5 < i4; i5++) {
                    if (z62.m13387o(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f15657a) {
            case 0:
                return this.f15660d == this.f15659c;
            default:
                return this.f15660d == this.f15659c;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15657a) {
            case 0:
                return new zv2(this, 0, (byte) 0);
            default:
                return new zv2(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        byte b = this.f15657a;
        List list = this.f15658b;
        int i = this.f15659c;
        switch (b) {
            case 0:
                int i2 = this.f15660d - 1;
                if (i > i2) {
                    return -1;
                }
                while (!z62.m13387o(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.f15660d - 1;
                if (i > i3) {
                    return -1;
                }
                while (!z62.m13387o(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f15657a) {
            case 0:
                return new zv2(this, 0, (byte) 0);
            default:
                return new zv2(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.f15657a;
        int i = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                int i2 = this.f15660d;
                while (i < i2) {
                    if (z62.m13387o(list.get(i), obj)) {
                        list.remove(i);
                        this.f15660d--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.f15660d;
                while (i < i3) {
                    if (z62.m13387o(list.get(i), obj)) {
                        list.remove(i);
                        this.f15660d--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f15657a) {
            case 0:
                int i = this.f15660d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f15660d;
            default:
                int i2 = this.f15660d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f15660d;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.f15657a;
        int i = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                int i2 = this.f15660d;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.f15660d--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                return i2 != this.f15660d;
            default:
                int i4 = this.f15660d;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.f15660d--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                return i4 != this.f15660d;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.f15657a;
        int i2 = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                q23.m9714a(this, i);
                break;
            default:
                vw2.m12009a(this, i);
                break;
        }
        return list.set(i + i2, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f15657a) {
            case 0:
                i = this.f15660d;
                i2 = this.f15659c;
                break;
            default:
                i = this.f15660d;
                i2 = this.f15659c;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f15657a) {
            case 0:
                q23.m9715b(this, i, i2);
                return new bw2(this, i, i2, (byte) 0);
            default:
                vw2.m12010b(this, i, i2);
                return new bw2(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f15657a) {
            case 0:
                break;
        }
        return zy5.m13859W(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f15657a) {
            case 0:
                break;
        }
        return zy5.m13860X(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f15657a) {
            case 0:
                return new zv2(this, i, (byte) 0);
            default:
                return new zv2(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.f15657a;
        List list = this.f15658b;
        switch (b) {
            case 0:
                int i = this.f15660d;
                this.f15660d = i + 1;
                list.add(i, obj);
                break;
            default:
                int i2 = this.f15660d;
                this.f15660d = i2 + 1;
                list.add(i2, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.f15657a;
        List list = this.f15658b;
        switch (b) {
            case 0:
                list.addAll(this.f15660d, collection);
                this.f15660d = collection.size() + this.f15660d;
                return collection.size() > 0;
            default:
                list.addAll(this.f15660d, collection);
                int size = collection.size();
                this.f15660d += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.f15657a;
        int i2 = this.f15659c;
        List list = this.f15658b;
        switch (b) {
            case 0:
                q23.m9714a(this, i);
                Object objRemove = list.remove(i + i2);
                this.f15660d--;
                return objRemove;
            default:
                vw2.m12009a(this, i);
                Object objRemove2 = list.remove(i + i2);
                this.f15660d--;
                return objRemove2;
        }
    }
}
