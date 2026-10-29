package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: kj */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0837kj implements ti1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23159a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ w94 f23160b;

    public /* synthetic */ C0837kj(byte b) {
        this.f23159a = b;
    }

    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        byte b = this.f23159a;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    w94 w94Var = this.f23160b;
                    Collection collectionM6322h1 = hb0.m6322h1(list);
                    if (!(collectionM6322h1 instanceof Collection)) {
                        collectionM6322h1 = hb0.m6319e1(collectionM6322h1);
                    }
                    w94Var.removeAll(collectionM6322h1);
                }
                break;
            case 1:
                c62 c62Var = (c62) obj;
                w94 w94Var2 = this.f23160b;
                if (c62Var instanceof mx1) {
                    w94Var2.add(c62Var);
                } else if (c62Var instanceof nx1) {
                    w94Var2.remove(((nx1) c62Var).f26162a);
                } else if (c62Var instanceof rk1) {
                    w94Var2.add(c62Var);
                } else if (c62Var instanceof sk1) {
                    w94Var2.remove(((sk1) c62Var).f30352a);
                } else if (c62Var instanceof ff3) {
                    w94Var2.add(c62Var);
                } else if (c62Var instanceof gf3) {
                    w94Var2.remove(((gf3) c62Var).f19768a);
                } else if (c62Var instanceof ef3) {
                    w94Var2.remove(((ef3) c62Var).f18051a);
                }
                break;
            default:
                c62 c62Var2 = (c62) obj;
                w94 w94Var3 = this.f23160b;
                if (c62Var2 instanceof rk1) {
                    w94Var3.add(c62Var2);
                } else if (c62Var2 instanceof sk1) {
                    w94Var3.remove(((sk1) c62Var2).f30352a);
                } else if (c62Var2 instanceof ff3) {
                    w94Var3.add(c62Var2);
                } else if (c62Var2 instanceof gf3) {
                    w94Var3.remove(((gf3) c62Var2).f19768a);
                } else if (c62Var2 instanceof ef3) {
                    w94Var3.remove(((ef3) c62Var2).f18051a);
                } else if (c62Var2 instanceof x21) {
                    w94Var3.add(c62Var2);
                } else if (c62Var2 instanceof y21) {
                    w94Var3.remove(((y21) c62Var2).f34820a);
                } else if (c62Var2 instanceof w21) {
                    w94Var3.remove(((w21) c62Var2).f33036a);
                }
                break;
        }
        return ju4Var;
    }
}
