package p000;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: no */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0953no extends uq4 {

    /* JADX INFO: renamed from: c */
    public static final C0916mo f25975c = new C0916mo();

    /* JADX INFO: renamed from: a */
    public Class f25976a;

    /* JADX INFO: renamed from: b */
    public bq2 f25977b;

    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        Class cls = this.f25976a;
        if (kb2Var.mo7481R() == 9) {
            kb2Var.mo7477N();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        kb2Var.mo7490a();
        while (kb2Var.mo7501v()) {
            arrayList.add(this.f25977b.f15505c.mo166b(kb2Var));
        }
        kb2Var.mo7495j();
        int size = arrayList.size();
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        if (obj == null) {
            yb2Var.mo12211t();
            return;
        }
        yb2Var.mo12206b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f25977b.mo167c(yb2Var, Array.get(obj, i));
        }
        yb2Var.mo12208j();
    }
}
