package com.badlogic.gdx.box2d.structs;

import com.badlogic.gdx.jnigen.runtime.CHandler;
import com.badlogic.gdx.jnigen.runtime.pointer.Struct;
import com.badlogic.gdx.jnigen.runtime.pointer.StackElementPointer;
import com.badlogic.gdx.box2d.FFITypes;

public final class b2TreeStats extends com.badlogic.gdx.jnigen.runtime.pointer.Struct {

    private final static int __size;

    private final static long __ffi_type;

    static {
        __ffi_type = FFITypes.getCTypeInfo(73).getFfiType();
        __size = CHandler.getSizeFromFFIType(__ffi_type);
    }

    public b2TreeStats(long pointer, boolean freeOnGC) {
        super(pointer, freeOnGC);
    }

    public b2TreeStats() {
        super(__size);
    }

    public long getSize() {
        return __size;
    }

    public long getFFIType() {
        return __ffi_type;
    }

    public b2TreeStats.b2TreeStatsPointer asPointer() {
        return new b2TreeStats.b2TreeStatsPointer(getPointer(), getsGCFreed());
    }

    public int nodeVisits() {
        return (int) getValue(0);
    }

    public void nodeVisits(int nodeVisits) {
        setValue(nodeVisits, 0);
    }

    public int leafVisits() {
        return (int) getValue(1);
    }

    public void leafVisits(int leafVisits) {
        setValue(leafVisits, 1);
    }

    public static final class b2TreeStatsPointer extends StackElementPointer<b2TreeStats> {

        public b2TreeStatsPointer(long pointer, boolean freeOnGC) {
            super(pointer, freeOnGC);
        }

        public b2TreeStatsPointer() {
            this(1, true, true);
        }

        public b2TreeStatsPointer(int count, boolean freeOnGC, boolean guard) {
            super(__size, count, freeOnGC, guard);
        }

        public b2TreeStats.b2TreeStatsPointer guardCount(long count) {
            super.guardCount(count);
            return this;
        }

        public int getSize() {
            return __size;
        }

        protected b2TreeStats createStackElement(long ptr, boolean freeOnGC) {
            return new b2TreeStats(ptr, freeOnGC);
        }
    }
}