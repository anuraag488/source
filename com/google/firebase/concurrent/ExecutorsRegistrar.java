package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000.InterfaceC0703gw;
import p000.ev0;
import p000.jg0;
import p000.ni3;
import p000.pf0;
import p000.qf0;
import p000.qg2;
import p000.r00;
import p000.tt4;
import p000.vk2;
import p000.wb1;
import p000.xx0;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a */
    public static final qg2 f16303a = new qg2(new jg0((byte) 1));

    /* JADX INFO: renamed from: b */
    public static final qg2 f16304b = new qg2(new jg0((byte) 2));

    /* JADX INFO: renamed from: c */
    public static final qg2 f16305c = new qg2(new jg0((byte) 3));

    /* JADX INFO: renamed from: d */
    public static final qg2 f16306d = new qg2(new jg0((byte) 4));

    /* JADX INFO: renamed from: a */
    public static xx0 m4073a(ExecutorService executorService) {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f16306d.get();
        xx0 xx0Var = new xx0();
        xx0Var.f34689a = executorService;
        xx0Var.f34690b = scheduledExecutorService;
        VarHandle.storeStoreFence();
        return xx0Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        byte b;
        ni3 ni3Var = new ni3(InterfaceC0703gw.class, ScheduledExecutorService.class);
        ni3[] ni3VarArr = {new ni3(InterfaceC0703gw.class, ExecutorService.class), new ni3(InterfaceC0703gw.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(ni3Var);
        int i = 0;
        while (true) {
            b = 2;
            if (i >= 2) {
                break;
            }
            ev0.m5342Q(ni3VarArr[i], "Null interface");
            i++;
        }
        Collections.addAll(hashSet, ni3VarArr);
        qf0 qf0Var = new qf0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new wb1((byte) 0), hashSet3);
        ni3 ni3Var2 = new ni3(r00.class, ScheduledExecutorService.class);
        ni3[] ni3VarArr2 = {new ni3(r00.class, ExecutorService.class), new ni3(r00.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(ni3Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            ev0.m5342Q(ni3VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, ni3VarArr2);
        qf0 qf0Var2 = new qf0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new wb1((byte) 1), hashSet6);
        ni3 ni3Var3 = new ni3(vk2.class, ScheduledExecutorService.class);
        ni3[] ni3VarArr3 = {new ni3(vk2.class, ExecutorService.class), new ni3(vk2.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(ni3Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            ev0.m5342Q(ni3VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, ni3VarArr3);
        qf0 qf0Var3 = new qf0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new wb1(b), hashSet9);
        pf0 pf0VarM9879a = qf0.m9879a(new ni3(tt4.class, Executor.class));
        pf0VarM9879a.f27576f = new wb1((byte) 3);
        return Arrays.asList(qf0Var, qf0Var2, qf0Var3, pf0VarM9879a.m9510b());
    }
}
