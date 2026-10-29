package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class wq4 extends uq4 {
    @Override // p000.uq4
    /* JADX INFO: renamed from: b */
    public final Object mo166b(kb2 kb2Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        kb2Var.mo7490a();
        while (kb2Var.mo7501v()) {
            try {
                arrayList.add(Integer.valueOf(kb2Var.mo7473J()));
            } catch (NumberFormatException e) {
                throw new lb2(e);
            }
        }
        kb2Var.mo7495j();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // p000.uq4
    /* JADX INFO: renamed from: c */
    public final void mo167c(yb2 yb2Var, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        yb2Var.mo12206b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            yb2Var.mo12199D(atomicIntegerArray.get(i));
        }
        yb2Var.mo12208j();
    }
}
