package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new edu.ucsc.cse118.assignment2.DataBinderMapperImpl());
  }
}
