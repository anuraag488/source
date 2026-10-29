package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class fd1 {

    /* JADX INFO: renamed from: a */
    public final List f18921a;

    public fd1(List list) {
        this.f18921a = list;
    }

    /* JADX INFO: renamed from: a */
    public fd1 mo3974a(hr3 hr3Var) {
        sl2 sl2VarM7680G = kx5.m7680G();
        List list = this.f18921a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sl2VarM7680G.add(((as0) list.get(i)).m3219e(hr3Var));
        }
        return new dd1(kx5.m7740w(sl2VarM7680G));
    }
}
