package p000;

import android.view.View;
import android.view.ViewGroup;
import java.lang.invoke.VarHandle;
import java.util.Iterator;

/* JADX INFO: renamed from: p1 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1018p1 implements Iterator, cc2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27268a;

    /* JADX INFO: renamed from: b */
    public int f27269b;

    /* JADX INFO: renamed from: c */
    public Object f27270c;

    public C1018p1(AbstractC1129s1 abstractC1129s1) {
        this.f27268a = (byte) 0;
        this.f27270c = abstractC1129s1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f27268a) {
            case 0:
                return this.f27269b < ((AbstractC1129s1) this.f27270c).mo103a();
            case 1:
                return this.f27269b < ((Object[]) this.f27270c).length;
            case 2:
                return this.f27269b > 0;
            case 3:
                return this.f27269b < ((byte[]) this.f27270c).length;
            case 4:
                return this.f27269b < ((int[]) this.f27270c).length;
            case 5:
                return this.f27269b < ((long[]) this.f27270c).length;
            case 6:
                return this.f27269b < ((short[]) this.f27270c).length;
            default:
                return this.f27269b < ((ViewGroup) this.f27270c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f27268a) {
            case 0:
                if (!hasNext()) {
                    xy4.m12795x();
                    return null;
                }
                AbstractC1129s1 abstractC1129s1 = (AbstractC1129s1) this.f27270c;
                int i = this.f27269b;
                this.f27269b = i + 1;
                return abstractC1129s1.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f27270c;
                    int i2 = this.f27269b;
                    this.f27269b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f27269b--;
                    ds3.m4667k(e.getMessage());
                    return null;
                }
            case 2:
                t91 t91Var = (t91) this.f27270c;
                int i3 = t91Var.f16972c;
                int i4 = this.f27269b;
                this.f27269b = i4 - 1;
                return t91Var.f16974e[i3 - i4];
            case 3:
                int i5 = this.f27269b;
                byte[] bArr = (byte[]) this.f27270c;
                if (i5 >= bArr.length) {
                    ds3.m4667k(String.valueOf(i5));
                    return null;
                }
                this.f27269b = i5 + 1;
                byte b = bArr[i5];
                ms4 ms4Var = new ms4();
                ms4Var.f25180a = b;
                VarHandle.storeStoreFence();
                return ms4Var;
            case 4:
                int i6 = this.f27269b;
                int[] iArr = (int[]) this.f27270c;
                if (i6 >= iArr.length) {
                    ds3.m4667k(String.valueOf(i6));
                    return null;
                }
                this.f27269b = i6 + 1;
                int i7 = iArr[i6];
                rs4 rs4Var = new rs4();
                rs4Var.f29588a = i7;
                VarHandle.storeStoreFence();
                return rs4Var;
            case 5:
                int i8 = this.f27269b;
                long[] jArr = (long[]) this.f27270c;
                if (i8 >= jArr.length) {
                    ds3.m4667k(String.valueOf(i8));
                    return null;
                }
                this.f27269b = i8 + 1;
                long j = jArr[i8];
                ws4 ws4Var = new ws4();
                ws4Var.f33693a = j;
                VarHandle.storeStoreFence();
                return ws4Var;
            case 6:
                int i9 = this.f27269b;
                short[] sArr = (short[]) this.f27270c;
                if (i9 >= sArr.length) {
                    ds3.m4667k(String.valueOf(i9));
                    return null;
                }
                this.f27269b = i9 + 1;
                short s = sArr[i9];
                bt4 bt4Var = new bt4();
                bt4Var.f15594a = s;
                VarHandle.storeStoreFence();
                return bt4Var;
            default:
                ViewGroup viewGroup = (ViewGroup) this.f27270c;
                int i10 = this.f27269b;
                this.f27269b = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f27268a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f27270c;
                int i = this.f27269b - 1;
                this.f27269b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public /* synthetic */ C1018p1(byte b) {
        this.f27268a = b;
    }
}
